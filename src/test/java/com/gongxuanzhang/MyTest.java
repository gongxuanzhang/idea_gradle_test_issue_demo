package com.gongxuanzhang;

import org.junit.jupiter.api.Test;

import java.io.IOException;


/**
 * @author gongxuanzhangmelt@gmail.com
 **/
public class MyTest {


    @Test
    void a() {
        System.out.println("a");
    }

    @Test
    void b() throws IOException {
        System.out.println("b");
    }

    @Test
    void c() {
        System.out.println("c");
    }
}
