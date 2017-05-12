
### scenario

* `db` subproject is built as a non-modular jar
* We want `service` module to use the `db` code from unnamed module.
    * Other examples illustrate doing this as an automatic module.
* This example won't work, because it is illegal for a named module to read the unnamed module (aka the classpath).
* This example is simply an illustration, not a critique.

### Execution Steps

* this fails (which is the intent of this example):
    * `./compile.sh`
