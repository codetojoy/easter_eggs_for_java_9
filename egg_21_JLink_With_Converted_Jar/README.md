
### Convert commons-lang jar to a module

* in this section, we pretend to be authors of the library
* `cd convert`
* `./gen.sh in/commons-lang3-3.5.jar`
* `./build.sh in/commons-lang3-3.5.jar commons.lang`
* `jdeps --list-deps out/commons.lang.jar`

### build app

* `./clean.sh`
* `./build.sh`
* `./run_foo_app.sh`

### jlink

* `link.sh`

### run 

* `./foo.runtime/bin/java --list-modules`
* `./foo.runtime/bin/java --module foo.app`


