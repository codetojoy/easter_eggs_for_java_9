
MY_HOME=$PWD
DEST_DIR=$MY_HOME/lib
BUILD_HOME=build/modules

./clean.sh

javac -d $BUILD_HOME \
--module-source-path src \
`find src -name "*.java"`

jar --create --file=$DEST_DIR/net.codetojoy.x.jar -C $BUILD_HOME/net.codetojoy.x .
jar --create --file=$DEST_DIR/net.codetojoy.a.jar -C $BUILD_HOME/net.codetojoy.a .
jar --create --file=$DEST_DIR/net.codetojoy.b.jar -C $BUILD_HOME/net.codetojoy.b .

jar --create --file=$DEST_DIR/net.codetojoy.c.jar --main-class=net.codetojoy.c.Runner \
-C $BUILD_HOME/net.codetojoy.c . 

