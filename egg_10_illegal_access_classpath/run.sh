
./compile.sh

# --illegal-access=permit [default]
# --illegal-access=warn 
# --illegal-access=deny 

java \
--illegal-access=deny \
--class-path build \
net.codetojoy.App

