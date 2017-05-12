
./clean.sh

# utils.jar is automatic module refers to commons-lang3 on classpath
javac -d build/modules \
--module-source-path src \
--class-path utils/3rdparty/* \
--module-path utils/build/libs \
`find src -name "*.java"`

jar --create --file=lib/net.codetojoy.db@1.0.jar \
--module-version=1.0 -C build/modules/net.codetojoy.db .

jar --create --file=lib/net.codetojoy.service@1.0.jar \
--module-version=1.0 \
--main-class=net.codetojoy.service.impl.UserServiceImpl \
-C build/modules/net.codetojoy.service .
