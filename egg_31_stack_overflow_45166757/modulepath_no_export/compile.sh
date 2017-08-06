
./clean.sh

RESOURCE_PACKAGE=net/codetojoy/example/resources
RESOURCE_BUILD_DIR=build_mlib/$RESOURCE_PACKAGE

echo "compiling example module ..."

javac -d build_mlib \
--source-path src/net.codetojoy.example \
`find src/net.codetojoy.example -name "*.java"`

echo "copying image resource ..."

cp ../resources/640px-Baden.Beethoven01.jpg $RESOURCE_BUILD_DIR

echo "building jar ..."

jar --create --file=mlib/net.codetojoy.example.jar \
-C build_mlib . 

echo "compiling main App ..."

javac -d build_app \
--module-path mlib \
--add-modules net.codetojoy.example \
--source-path src/main \
`find src/main -name "*.java"`

echo "Ready."
