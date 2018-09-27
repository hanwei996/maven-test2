package com.shadow.test.maven;

import com.shadow.test.maven.mavenTest.HelloMaven;
import org.junit.Assert;
import org.junit.Test;

public class demo {
    @Test
    public void test(){
        HelloMaven hello = new HelloMaven();
        String result = hello.hello();
        // 断言
        Assert.assertEquals("hanw", result);
    }
}
