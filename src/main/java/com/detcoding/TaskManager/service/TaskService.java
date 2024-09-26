package com.detcoding.TaskManager.service;

import com.detcoding.TaskManager.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();

    Task findById(int id);

    Task findByTitle(String title);

    void deleteById(int id);

    void save(Task task);

    void deleteByTitle(String title);
}
