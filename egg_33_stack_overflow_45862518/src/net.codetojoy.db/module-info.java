
module net.codetojoy.db {
    exports net.codetojoy.db.foo;
    exports net.codetojoy.db.api to net.codetojoy.service;
    requires transitive java.sql;
}
