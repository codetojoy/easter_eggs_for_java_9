
### automatic module

* `utils` subproject builds `utils/build/libs/utils.jar`
* `utils.jar` is not modularized, but rather put on the module-path as an automatic module
    * it uses the `Automatic-Module-Name` attribute in jar manifest to define `net.codetojoy.utils`
* `utils.jar` depends on `commons-lang3-3.5.jar` which remains on the classpath
* see `src/net.codetojoy.service/module-info.java` [here](https://github.com/codetojoy/easter_eggs_for_java_9/blob/master/egg_05c_Automatic_Module/src/net.codetojoy.service/module-info.java)

### Execution Steps

* outside of Docker, with Gradle installed:
    * `cd utils` then `gradle build`

* in Docker container:
    * `./compile.sh`
    * `./run_UserService.sh`

* optionally, in Docker container:
    * `list_net.codetojoy.db.sh`
    * `list_net.codetojoy.service.sh`
    * `./run_UserDao.sh`
