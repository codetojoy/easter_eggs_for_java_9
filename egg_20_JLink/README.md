
### Scenario

* build two modules
* use `jlink` to create binary image in `serviceapp`

### Execution Steps

* to build:
    * `./compile.sh`
* to link:
    * `./link.sh $JAVA_HOME`
* view size of runtime:
    * `du -m serviceapp`
* to run:
    * `./serviceapp/bin/java net.codetojoy.service.impl.UserServiceImpl`
* optional:
    * `list_net.codetojoy.db.sh`
    * `list_net.codetojoy.service.sh`
    * `./serviceapp/bin/java --list-modules`
