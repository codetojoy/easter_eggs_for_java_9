 
module net.codetojoy.service {
    exports net.codetojoy.service.api;

    requires net.codetojoy.db;
    requires java.rmi;

    requires commons.lang;
    // this works in b168: requires commons.lang3;
}

