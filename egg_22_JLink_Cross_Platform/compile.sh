
./clean.sh

javac -d build/modules \
--module-source-path src \
`find src -name "*.java"`

jar --create --file=lib/net.codetojoy.db@1.0.jar \
-C build/modules/net.codetojoy.db . 

jar --create --file=lib/net.codetojoy.service@1.0.jar \
-C build/modules/net.codetojoy.service . 

