rm -rf foo.runtime

MJARS=convert/out
MLIB=mlib

jlink \
--module-path $JAVA_HOME/jmods:$MLIB:$MJARS \
--add-modules foo.app \
--compress=2 \
--strip-debug \
--output foo.runtime
