package com.castorcas.dao;

import java.io.InputStream;
import java.util.Properties;

public class ConfigFileDAO {

    private static final String CONFIG_FILENAME = "config.properties";

    private String result = "";
    private InputStream inputStream;

    public ConfigFileDAO(){

    }

    public String getConfigProperty(String propertyName){

        result = "";

        try{
            Properties properties = new Properties();
            String filename = CONFIG_FILENAME;
            inputStream = getClass().getClassLoader().getResourceAsStream(filename);
            properties.load(inputStream);
            result = properties.getProperty(propertyName);

            if(inputStream != null){
                inputStream.close();
                inputStream = null;
            }
        }

        catch(Exception e){
            System.out.println("Exception: " + e);
        }

        finally{
            if(inputStream != null){
                inputStream = null;
            }
        }

        return result;

    }
}
