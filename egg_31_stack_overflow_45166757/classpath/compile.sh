
./clean.sh

echo "compiling example lib ..."

javac -d build_lib \
--source-path src/net.codetojoy.example \
`find src/net.codetojoy.example -name "*.java"`

echo "copying image resource ..."

mkdir -p build_lib/net/codetojoy/example/resources
cp ../resources/640px-Baden.Beethoven01.jpg build_lib/net/codetojoy/example/resources

echo "building jar ..."

jar --create --file=lib/net.codetojoy.example.jar \
-C build_lib . 

echo "compiling main App ..."

javac -d build_app \
--class-path lib/net.codetojoy.example.jar \
--source-path src/main \
`find src/main -name "*.java"`

echo "Ready."
