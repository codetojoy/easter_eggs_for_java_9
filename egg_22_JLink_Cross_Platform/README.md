
### Scenario

* build two modules: `net.codetojoy.db` and `net.codetojoy.service`
* the program is simply a hello-world from `UserServiceImpl` in the `net.codetojoy.service` module
* use `jlink` to create binary image for Linux 64 in `serviceapp`
* this example illustrates running on Mac OS and using Docker for Linux 64
    * the binary image is executed on Linux 64 inside a Docker container (Ubuntu)

### JDK Preparation

* download JDK 9 `tar.gz` file for Linux 64 from [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)
* unzip the file into `./jdk9_linux64` in this project

### Docker Preparation

* `docker pull ubuntu` 

### Execution Steps

* to build:
    * on host machine (i.e. Mac OS): `./compile.sh`
* to link:
    * on host machine (i.e. Mac OS). Edit the JDK version as appropriate: `./link.sh ./jdk9_linux_64/jdk-9.0.1`
    * NOTE: the above points to Linux 64 JDK; the resulting binary will not run on Mac OS!
* view size of runtime:
    * in Docker terminal (i.e. Ubuntu): `./list.sh`
* to run in Docker container:
    * in Docker terminal (i.e. Ubuntu): `./run.sh`
