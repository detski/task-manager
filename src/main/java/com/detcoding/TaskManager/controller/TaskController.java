package com.detcoding.TaskManager.controller;

import com.detcoding.TaskManager.entity.Task;
import com.detcoding.TaskManager.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String showHome(Model model) {

        // get the employees from db
        List<Task> tasks = taskService.findAll();

        // add to the spring model
        model.addAttribute("tasks", tasks);

        return "index";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("taskId") int taskId) {

        // delete the employee
        taskService.deleteById(taskId);

        return "redirect:/";

    }

    @PostMapping("/save")
    public String saveTask(@ModelAttribute ("task") Task task) {
        // save the task
        taskService.save(task);

        // use a redirect to prevent duplicate submissions
        return "redirect:/";
    }


    @GetMapping("/addTask")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Task task = new Task();

        theModel.addAttribute("title", "Add New Task");
        theModel.addAttribute("task", task);

        return "task-form";
    }

    @GetMapping("/update")
    public String updateEmployee(@RequestParam("taskId") int id, Model model){
        Task task = taskService.findById(id);
        model.addAttribute("title", "Update a Task");
        model.addAttribute("task", task);
        return "task-form";
    }
}
