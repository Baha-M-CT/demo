package com.backend.todo.service;

import com.backend.todo.repository.TasksRepository;
import com.backend.todo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TasksRepository taskRepository;

    public List<Task> getAll() {
        return taskRepository.findAll();
    }
    //Sort.by(Sort.Order.asc("id"))

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void delete(int id) {
        taskRepository.deleteById(id);
    }
}
