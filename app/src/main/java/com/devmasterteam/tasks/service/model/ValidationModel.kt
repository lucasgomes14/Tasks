package com.devmasterteam.tasks.service.model

class ValidationModel(message: String = "") {

    private var status = true
    private var validationMessage = ""

    init {
        if (message != "") {
            validationMessage = message
            status = false
        }
    }

    fun status() = status
    fun message() = validationMessage
}