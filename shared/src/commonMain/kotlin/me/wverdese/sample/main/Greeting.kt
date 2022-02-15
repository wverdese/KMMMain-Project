package me.wverdese.sample.main

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}