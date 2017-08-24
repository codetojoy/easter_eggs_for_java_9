
### Intro

* in response to [this question](https://stackoverflow.com/questions/45862518) on Stack Overflow

### Idea

* module `net.codetojoy.db`
    * exports `net.codetojoy.db.foo`
    * exports `net.codetojoy.db.api` to `net.codetojoy.service`
* module `net.codetojoy.service`
    * requires `net.codetojoy.db` as `transitive`
* module `net.codetojoy.client`
    * requires `net.codetojoy.service`
* by editing `src/net.codetojoy.client/net/codetojoy/client/Client.java` you can see that `Client.java` can access `net.codetojoy.db.foo` but not `net.codetojoy.db.api`
 
### Execution Steps

* `./compile.sh`
* `./run_Client.sh`
* `./run_UserService.sh`
