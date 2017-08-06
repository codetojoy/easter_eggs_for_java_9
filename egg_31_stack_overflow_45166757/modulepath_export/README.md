
### To Run

* execute: `build_run.sh`

### Notes

* This creates a modular jar, `lib/net.codetojoy.example.jar`
* The jar contains `net.codetojoy/example/resources/640px-Baden.Beethoven01.jpg`
* The module exports `net.codetojoy/example/resources`
* `App.java` uses the module and attempts to load the image. It works because the package is exported.

### Layout

* the main app resides in the default package:
```
src/main/App.java
```

* typical module structure:
```
src/net.codetojoy.example/module-info.java
src/net.codetojoy.example/net/codetojoy/example/Composer.java
```

* the build script copies the image into place during jar creation
```
src/net.codetojoy.example/net/codetojoy/example/resources/640px-Baden.Beethoven01.jpg
```

* we use a place-holder class to placate the compiler
```
src/net.codetojoy.example/net/codetojoy/example/resources/PlaceHolder.java
```

### Photo Credit

* _Beethoven house (1821-1823) at the Rathausgasse 10, Baden bei Wien. Here he wrote the Missa Solemnis and completed the 9th symphony "Ode to Joy"_, [link](https://en.wikipedia.org/wiki/Ode_to_Joy#/media/File:Baden.Beethoven01.jpg) by Georges Jansoone, via [CC BY 2.5](https://creativecommons.org/licenses/by/2.5/)
