
javac \
--class-path ../build/modules/net.codetojoy \
--patch-module net.codetojoy=../src \
-d mypatches/net.codetojoy \
src/net.codetojoy/net/codetojoy/service/impl/UserServiceImpl.java

