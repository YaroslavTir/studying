package com.yaroslavtir;

import junit.framework.Assert;
import org.junit.Test;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class HelloTest {
    @Test
    public void testSayHello() throws Exception {
        Hello hello = new Hello();
        Assert.assertEquals("hi mimi", hello.sayHello("mimi"));
    }
}
