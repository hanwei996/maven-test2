package com.shadow.test.maven.mavenTest;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class Main {
    @Test
    public void test() throws IOException {
        HelloMaven hello = new HelloMaven();
        String result = hello.hello();
        // 断言
        Assert.assertEquals("hanw", result);
    }


}
