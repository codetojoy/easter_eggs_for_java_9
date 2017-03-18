
./clean.sh

# utils.jar is brought in as automatic module
javac -d build/modules \
--module-source-path src \
--module-path utils/build/libs:utils/3rdparty \
`find src -name "*.java"`

jar --create --file=lib/net.codetojoy.db@1.0.jar \
--module-version=1.0 -C build/modules/net.codetojoy.db . 

jar --create --file=lib/net.codetojoy.service@1.0.jar \
--module-version=1.0 \
--main-class=net.codetojoy.service.impl.UserServiceImpl \
-C build/modules/net.codetojoy.service . 

