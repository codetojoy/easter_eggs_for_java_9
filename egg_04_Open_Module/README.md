
### Idea

* `net.codetojoy.db` module is open
* `net.codetojoy.service.impl.UserServiceImpl` cannot compile with `UserDaoImpl` (it is not exported), but it can use reflection
* `net.codetojoy.db` module defined [here](https://github.com/codetojoy/easter_eggs_for_java_9/blob/master/egg_04_Open_Module/src/net.codetojoy.db/module-info.java)
* `net.codetojoy.service` module defined [here](https://github.com/codetojoy/easter_eggs_for_java_9/blob/master/egg_04_Open_Module/src/net.codetojoy.service/module-info.java)

### Execution Steps

* compile, list contents of modules, and run some `main` entry points:
* `./compile.sh`
* `list_net.codetojoy.db.sh`
* `list_net.codetojoy.service.sh`
* `./run_UserDao.sh`
* `./run_UserService.sh`
