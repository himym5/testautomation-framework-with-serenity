package com.cgm.life.test.utils.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private Properties properties = new Properties();
    private String filePath = "";

    public PropertyReader(String filePath) {
        this.filePath = filePath;
        initPropertyReader();
    }

    public PropertyReader() {

        String configPath = System.getProperty("config");

        if (configPath != null) {
            filePath = configPath;
        } else {
            filePath = "/config.properties";
        }

        initPropertyReader();

    }

    private void initPropertyReader() {
        try (InputStream inputStream = PropertyReader.class.getResourceAsStream(filePath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new AssertionError(e.getMessage(), e);
        }
    }

    public String readProperty(String property) {
        String propertyValue = System.getProperty(property);
        if (propertyValue == null) {
            propertyValue = properties.getProperty(property);
        }
        return propertyValue;
    }
}
