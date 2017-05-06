rm -rf foo.runtime

MJARS=convert/out
MLIB=mlib

echo "JAVA_HOME is ${JAVA_HOME}"

jlink \
--module-path $JAVA_HOME/jmods:$MLIB:$MJARS \
--add-modules foo.app \
--compress=2 \
--strip-debug \
--output foo.runtime
