
open module net.codetojoy.db {
    exports net.codetojoy.db.api to net.codetojoy.service;
    requires transitive java.sql;
}
