package com.devmasterteam.tasks.service.repository

import com.devmasterteam.tasks.service.repository.remote.RetrofitClient

class TaskRepository {

    private val remote = RetrofitClient.getService(TaskRepository::class.java)
}