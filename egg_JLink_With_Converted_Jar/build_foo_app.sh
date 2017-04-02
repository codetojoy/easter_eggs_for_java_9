
MJARS=$PWD/convert/out
MLIB=$PWD/mlib

cd foo.app

# compile
javac -d build \
--module-source-path src/main/java \
--module-path $MLIB:$MJARS \
`find src/main/java -name "*.java"`

cd build/foo.app

# jar
jar cfe $MLIB/foo.app.jar net.codetojoy.app.App *
