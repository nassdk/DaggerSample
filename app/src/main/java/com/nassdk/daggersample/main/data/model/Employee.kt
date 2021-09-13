package com.nassdk.daggersample.main.data.model

class Employee(
    private val company: Company
) {
    override fun toString(): String {
        return "User is busy at ${company.name}"
    }
}