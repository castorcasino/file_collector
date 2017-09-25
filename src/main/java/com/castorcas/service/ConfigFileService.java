package com.castorcas.service;

import com.castorcas.dao.ConfigFileDAO;

public class ConfigFileService {

    private static ConfigFileDAO configFileDAO;
    public static final String TARGET_DIRECTORY = "target_directory";
    public static final String DESTINATION_DIRECTORY = "destination_directory";
    public static final String TARGET_FILES = "target_files";
    public static final String COPY_PREFIX = "copy_prefix";

    public ConfigFileService(){
        configFileDAO = new ConfigFileDAO();
    }

    public String getTargetDirectory(){
        return configFileDAO.getConfigProperty(TARGET_DIRECTORY);
    }

    public String getDestinationDirectory(){
        return configFileDAO.getConfigProperty(DESTINATION_DIRECTORY);
    }

    public String getTargetFiles(){
        return configFileDAO.getConfigProperty(TARGET_FILES);
    }

    public String getCopyPrefix(){
        return configFileDAO.getConfigProperty(COPY_PREFIX);
    }

}
