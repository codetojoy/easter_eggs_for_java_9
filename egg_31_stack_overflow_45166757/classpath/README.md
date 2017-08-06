
### To Run

* execute: `build_run.sh`

### Notes

* This creates a simple, old-fashioned jar, `lib/net.codetojoy.example.jar`
* The jar contains `net.codetojoy/example/resources/640px-Baden.Beethoven01.jpg`
* `App.java` uses the jar and attempts to load the image. 

### Layout

* the main app resides in the default package:
```
src/main/App.java
```

* the library mimics a module file-structure but does _not_ have a `module-info.java`
```
src/net.codetojoy.example/net/codetojoy/example/Composer.java
```

* the build script copies the image into place during jar creation
```
src/net.codetojoy.example/net/codetojoy/example/resources/640px-Baden.Beethoven01.jpg
```

