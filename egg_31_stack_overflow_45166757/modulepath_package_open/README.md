
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

