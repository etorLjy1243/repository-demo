package com.architecture.repository

import com.architecture.repository.model.User

object ExampleSingleton {
    val singletonUser: User by lazy {
        User("etor_ljy@sina.com","ljy","image.png")
    }
}