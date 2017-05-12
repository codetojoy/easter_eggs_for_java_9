
#!/bin/bash

set -eE
trap "TRACER error: " ERR

if [ "$JAVA_HOME" = "" ]
then
   echo "please set JAVA_HOME"
   exit -1
fi

echo "------------------ egg_01_Basic_Trivial"
cd egg_01_Basic_Trivial
./compile.sh
./run.sh

echo "------------------ egg_02_Basic_Dependency"
cd ../egg_02_Basic_Dependency
./compile.sh
./list_net.codetojoy.db.sh
./list_net.codetojoy.service.sh
./run_UserDao.sh
./run_UserService.sh

echo "------------------ egg_03_Transitive_Export"
cd ../egg_03_Transitive_Export
./compile.sh
./list_net.codetojoy.db.sh
./list_net.codetojoy.service.sh
./run_UserDao.sh
./run_UserService.sh

echo "------------------ egg_04_Open_Module"
cd ../egg_04_Open_Module
./compile.sh
./list_net.codetojoy.db.sh
./list_net.codetojoy.service.sh
./run_UserDao.sh
./run_UserService.sh

echo "------------------ egg_05a_Automatic_Module"
cd ../egg_05a_Automatic_Module
# list commands don't work for some reason 
./compile.sh
./list_net.codetojoy.db.sh
./list_net.codetojoy.service.sh
./run_UserDao.sh
./run_UserService.sh

echo "------------------ egg_06_Services"
cd ../egg_06_Services
./list_net.codetojoy.db.sh
./list_net.codetojoy.dao.sh
./compile.sh
./run_Dao.sh

echo "------------------ egg_07_Unnamed_Module_Classpath_Driver"
cd ../egg_07_Unnamed_Module_Classpath_Driver
./compile.sh
./list_net.codetojoy.db.sh
./run_UserDao.sh
./run_UserService.sh

echo "------------------ egg_20_JLink"
cd ../egg_20_JLink
./compile.sh
./list_net.codetojoy.db.sh
./list_net.codetojoy.service.sh
./link.sh
./serviceapp/bin/java --list-modules
./serviceapp/bin/java net.codetojoy.service.impl.UserServiceImpl

# echo "------------------ egg_21_JLink_With_Converted_Jar"
# cd ../egg_21_JLink_With_Converted_Jar
# cd convert
# ./gen.sh in/commons-lang3-3.5.jar
# ./build.sh in/commons-lang3-3.5.jar commons.lang
# jdeps --list-deps out/commons.lang.jar
# cd ..
# ./clean.sh
# ./build.sh
# ./run_foo_app.sh
# ./link.sh
# ./foo.runtime/bin/java --list-modules
# ./foo.runtime/bin/java --module foo.app

cd ..
echo "Ready."
