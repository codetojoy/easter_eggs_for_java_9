
### Scenario

* build two modules
* use `jlink` to create binary image in `serviceapp`

### Execution Steps

* `./compile.sh`
* (optional) `list_net.codetojoy.db.sh`
* (optional) `list_net.codetojoy.service.sh`
* `link.sh`
* (optional) `./serviceapp/bin/java --list-modules`
* `./serviceapp/bin/java net.codetojoy.service.impl.UserServiceImpl`
