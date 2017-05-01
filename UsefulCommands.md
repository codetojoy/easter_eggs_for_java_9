
### Useful Commands


#### java

* `java --list-modules` to list all modules
* `java --list-modules java.sql` to describe a module
* `java -Xdiag:resolver --module-path ... ` for readability graph 

#### jdeps

* `jdeps --list-deps antlr.jar`
* `jdeps --generate-module-info . antlr.jar` (in theory)

#### jar

* `jar --file abc.jar --print-module-descriptor`
