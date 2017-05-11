
module net.codetojoy.db {
    requires net.codetojoy.dao;
    provides net.codetojoy.dao.spi.DaoProvider with net.codetojoy.db.DaoProviderImpl;
}
