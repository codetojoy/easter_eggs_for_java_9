
### Setup

* These instructions work for Mac OS X. Tweak as appropriate
* Install Docker from [here](https://www.docker.com/) 
* Open 'Docker Quick Start Terminal'

* set `MY_SRC_HOME` to be appropriate directory on your computer
* execute the following (one command at a time):

<pre>
cd $MY_SRC_HOME
docker build -t="my_jdk9" . 
docker run --rm -i -t -v $(pwd):/data my_jdk9 
</pre>

### Version as of 18-MAR-2017

<pre>
root@192c6fdfcf90:/# java -version
openjdk version "9-Debian"
OpenJDK Runtime Environment (build 9-Debian+0-9b159-1)
OpenJDK 64-Bit Server VM (build 9-Debian+0-9b159-1, mixed mode)
</pre>

