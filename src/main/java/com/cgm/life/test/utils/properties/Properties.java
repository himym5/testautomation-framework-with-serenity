package com.cgm.life.test.utils.properties;

public class Properties {
    private static String baseUrl;

    public static String getBaseUrl() {
        PropertyReader reader = new PropertyReader();
        baseUrl = reader.readProperty("baseUrl");
        return baseUrl;
    }
}
