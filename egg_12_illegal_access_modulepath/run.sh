
./compile.sh

# --illegal-access=permit [default]
# --illegal-access=warn
# --illegal-access=deny

# NOTE: on modulepath, one cannot access JDK internals, even with 'permit'

java \
--module-path mlib \
-m net.codetojoy

