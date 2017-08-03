
./clean.sh

javac -d build/modules \
--module-source-path src \
`find src -name "*.java"`

jar --create --file=mlib/net.codetojoy.jar \
--main-class=net.codetojoy.App \
-C build/modules/net.codetojoy . 

