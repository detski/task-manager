package com.detcoding.TaskManager.dao;

import com.detcoding.TaskManager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    public List<Task> findAllByOrderByStatusAsc();

}
