
### Idea

* `net.codetojoy.service` depends on `net.codetojoy.db`
* `net.codetojoy.service` can use `java.sql` because `net.codetojoy.db` uses it as `transitive`

### Execution Steps

* `./compile.sh`
* `list_net.codetojoy.db.sh`
* `list_net.codetojoy.service.sh`
* `./run_UserDao.sh`
* `./run_UserService.sh`
