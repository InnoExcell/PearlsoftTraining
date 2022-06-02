package com.staff.renumeration;

public final class DbConfigSingleton {

    private final String hostName;

    public static String getDatabaseConnection() {
        return "";
    }

    private static final DbConfigSingleton instance = new DbConfigSingleton();

    private DbConfigSingleton() {
        hostName = "dbhost.ecobank.com";
    }

    public static DbConfigSingleton getInstance() {
        return instance;
    }
}
