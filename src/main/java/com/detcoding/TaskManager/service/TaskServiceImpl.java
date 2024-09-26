package com.detcoding.TaskManager.service;

import com.detcoding.TaskManager.dao.TaskRepository;
import com.detcoding.TaskManager.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;


    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(int id) {
        Optional<Task> result = taskRepository.findById(id);

        Task task = null;

        if (result.isPresent()) {
            task = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find task id - " + id);
        }

        return task;
    }

    @Override
    public Task findByTitle(String title) {
        return null;
    }

    @Override
    public void deleteById(int id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void save(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void deleteByTitle(String title) {

        taskRepository.delete(findByTitle(title));
    }
}
