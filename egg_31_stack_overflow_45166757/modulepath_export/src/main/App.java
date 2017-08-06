
import net.codetojoy.example.Composer; 

import java.io.InputStream;

public class App {
    // House where Beethoven completed 'Ode to Joy'
    // https://en.wikipedia.org/wiki/Ode_to_Joy#/media/File:Baden.Beethoven01.jpg
    //
    static final String IMAGE = "640px-Baden.Beethoven01.jpg";
    static final String RESOURCE = "resources/" + IMAGE;

    static InputStream getResourceAsStream(String resource) throws Exception {
        // load net/codetojoy/example/resource/image.jpg
        InputStream result = Composer.class.getResourceAsStream(resource);

        return result;
    }

    public static void main(String[] args) {
        try {
            InputStream inputStream = getResourceAsStream(RESOURCE);

            if (inputStream != null) {
                System.out.println("loaded image OK");
            } else {
                System.err.println("null stream: image not available");
            }
        } catch (Exception ex) {
            System.err.println("caught exception: " + ex.getMessage());
        }
    }
}
