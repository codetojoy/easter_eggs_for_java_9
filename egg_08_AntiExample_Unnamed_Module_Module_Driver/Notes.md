
### scenario

* `db` subproject is built in legacy mode
* We want `service` module to use the `db` code from unnamed module.
    * Other examples illustrate doing this as an automatic module.
* As it turns out, I believe this is impossible.
* See [this doc](http://openjdk.java.net/projects/jigsaw/spec/sotms/#the-unnamed-module)


