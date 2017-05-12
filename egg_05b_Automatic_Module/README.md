
### automatic module

* `utils` subproject builds `utils/build/libs/utils.jar`
* `utils.jar` is not modularized, but rather put on the module-path as an automatic module
* `utils.jar` depends on `commons-lang3-3.5.jar` which remains on the classpath
* see `src/net.codetojoy.service/module-info.java`

### Execution Steps

* outside of Docker, with Gradle installed:
    * `cd utils` then `gradle build`
* in Docker container:
    * `cd ..` then `./compile.sh`
    * `list_net.codetojoy.db.sh`
    * `list_net.codetojoy.service.sh`
    * `./run_UserDao.sh`
    * `./run_UserService.sh`
