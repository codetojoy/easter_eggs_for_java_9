
mkdir -p build/modules

javac -d build/modules \
--module-source-path src \
`find src -name "*.java"`

mkdir -p lib

jar --create --file=lib/net.codetojoy.db@1.0.jar \
--module-version=1.0 -C build/modules/net.codetojoy.db . 

jar --create --file=lib/net.codetojoy.service@1.0.jar \
--module-version=1.0 \
--main-class=net.codetojoy.service.api.UserService \
-C build/modules/net.codetojoy.service . 

