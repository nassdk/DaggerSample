package com.nassdk.daggersample.main.data.model

class Company(val name: String, private val type: String) {

    override fun toString(): String {
        return "Company name is $name, it is busy at $type"
    }
}