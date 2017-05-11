
./clean.sh

# build net.codetojoy.db module

javac -d build/modules \
--module-source-path src \
`find src -name "*.java"`

jar --create --file=lib/net.codetojoy.db@1.0.jar \
--module-version=1.0 -C build/modules/net.codetojoy.db . 

# build legacy service using net.codetojoy.db module
javac -d service/build \
-cp lib/net.codetojoy.db@1.0.jar \
`find service/src/main/java -name "*.java"`

jar --create --file=lib/service.jar \
--main-class=net.codetojoy.service.impl.UserService \
-C service/build . 

