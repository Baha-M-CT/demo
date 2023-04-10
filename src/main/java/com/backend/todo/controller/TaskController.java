package com.backend.todo.controller;

import com.backend.todo.entity.Task;
import com.backend.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Task> taskList = taskService.getAll();
        model.addAttribute("taskList", taskList);
        model.addAttribute("taskSize", taskList.size());
        return "index";
    }

    @RequestMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        taskService.delete(id);
        return "redirect:/";
    }


    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task) {
        taskService.save(task);
        System.out.println("test 2");
        return "redirect:/";
    }

//    @GetMapping("/tasks")
//    public String getTasks() {
//        String result = "[";
//        for (Task task : tasksRepository.findAll()) {
//            if (result.length() > 1) {
//                result += ",";
//            }
//            result += "\"" + task.getText() + "\"";
//        }
//        return result + "]";
//    }
//
//    @PostMapping("/task")
//    public String  createTask(@RequestParam String text) {
//
//        Task task = new Task();
//        task.setText(text);
//        tasksRepository.save(task);
//        return "Task created";
//
//    }

}
