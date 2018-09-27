package com.shadow.test.maven;

import org.apache.camel.main.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.addRouteBuilder(new MyRouteBuilder());
        main.run(args);
    }
    public void bug() throws IOException {
        String str = null;
        List<?> list = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        buffer.append(222);

        FileInputStream stream = new FileInputStream(new File("F://4.txt"));
        int i = stream.read();
        System.out.println("i:"+i);



    }


}

