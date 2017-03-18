
### transitive

* add `java.util.logging.Logger` to UserService
* edit `net.codetojoy.db` module so that `requires transitive java.sql`
* i.e. db module grants access to logging via sql

### exports to

* use egg_Basic_Dependency
* edit `net.codetojoy.db` module so that:

`exports net.codetojoy.db.api to net.codetojoy.service`

* run example
* change to:
 
`exports net.codetojoy.db.api to net.codetojoy.foo`

* confirm broken example
