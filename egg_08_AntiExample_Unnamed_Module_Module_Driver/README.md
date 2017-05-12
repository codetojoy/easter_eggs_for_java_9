
### scenario

* `db` subproject is built in legacy mode
* We want `service` module to use the `db` code from unnamed module.
    * Other examples illustrate doing this as an automatic module.
* This example won't work, because it is illegal for a named module to read the unnamed module (aka the classpath).

### Execution Steps

* `./compile.sh`
* `list_net.codetojoy.db.sh`
* `list_net.codetojoy.service.sh`
* `./run_UserDao.sh`
* `./run_UserService.sh`
