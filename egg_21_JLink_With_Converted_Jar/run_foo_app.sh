
MJARS=$PWD/convert/out
MLIB=$PWD/mlib

# run

java \
--module-path $MLIB:$MJARS \
--module foo.app
