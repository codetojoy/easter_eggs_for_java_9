
### automatic module

* `utils` subproject builds `utils/build/libs/utils.jar`
* `utils/3rdparty` has commons-lang3-3.5.jar as a dependency for `utils`
    * note that it must be used as `commons.lang`
* `javac` step uses JAR files as an automatic module
* see `src/net.codetojoy.service/module-info.java`

