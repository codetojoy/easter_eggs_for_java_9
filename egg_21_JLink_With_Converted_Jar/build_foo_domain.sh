
MJARS=$PWD/convert/out
MLIB=$PWD/mlib

cd foo.domain

# compile
javac -d build \
--module-source-path src/main/java \
--module-path $MJARS \
`find src/main/java -name "*.java"`

cd build/foo.domain

# jar
jar cf $MLIB/foo.domain.jar *
