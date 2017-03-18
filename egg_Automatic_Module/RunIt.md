
### Execution Steps

* outside of Docker, with Gradle installed:
    * `cd utils` then `gradle build`
* in Docker container:
    * `cd ..` then `./compile.sh`
    * `list_net.codetojoy.db.sh`
    * `list_net.codetojoy.service.sh`
    * `./run_UserDao.sh`
    * `./run_UserService.sh`
