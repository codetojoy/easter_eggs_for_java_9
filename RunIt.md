
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
