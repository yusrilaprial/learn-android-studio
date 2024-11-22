package com.learn_android

import org.junit.Assert
import org.junit.Test

class HelloTest {
    @Test
    fun sayHelloTest() {
        val result = Hello().sayHello("Yusril")
        Assert.assertEquals("Hello, Yusril", result)
    }
}