package com.castorcas.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigFileServiceMethodTests{

    @Test
    public void testGetTargetDirectory(){
        ConfigFileService service = new ConfigFileService();
        String expectedResult = "D:\\dump_repo";
        String actualResult = service.getTargetDirectory();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetDestinationDirectory(){
        ConfigFileService service = new ConfigFileService();
        String expectedResult = "E:\\";
        String actualResult = service.getDestinationDirectory();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetTargetFiles(){
        ConfigFileService service = new ConfigFileService();
        String expectedResult = "images";
        String actualResult = service.getTargetFiles();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testGetCopyPrefix(){
        ConfigFileService service = new ConfigFileService();
        String expectedResult = "Copy_of_";
        String actualResult = service.getCopyPrefix();
        Assert.assertEquals(actualResult, expectedResult);
    }

}

