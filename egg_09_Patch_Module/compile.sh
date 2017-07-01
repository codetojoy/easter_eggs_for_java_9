
./clean.sh

javac -d build/modules/net.codetojoy \
src/net.codetojoy/module-info.java \
`find src -name "*.java"`

