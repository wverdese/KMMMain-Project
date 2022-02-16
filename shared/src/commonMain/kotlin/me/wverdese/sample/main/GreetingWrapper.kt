package me.wverdese.sample.main

import me.wverdese.sample.app.Greeting

class GreetingWrapper {
    fun greeting(): String {
        return Greeting().greeting()
    }
}
