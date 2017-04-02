rm -rf foo.runtime

MJARS=convert/out
MLIB=mlib

jlink \
--module-path $JAVA_HOME/jmods:$MLIB:$MJARS \
--add-modules foo.app \
--output foo.runtime
