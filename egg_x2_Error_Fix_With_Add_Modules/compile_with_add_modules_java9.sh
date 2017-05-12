
./clean.sh

javac -d build --add-modules=java.xml.bind `find src -name "*.java"`

jar -cvf lib/net.codetojoy.example.jar -C build .

