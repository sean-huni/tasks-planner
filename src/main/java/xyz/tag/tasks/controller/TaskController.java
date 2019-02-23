package xyz.tag.tasks.controller;

import org.springframework.web.bind.annotation.*;
import xyz.tag.tasks.domain.Task;
import xyz.tag.tasks.service.TaskService;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.controller
 * USER      : sean
 * DATE      : 22-Fri-Feb-2019
 * TIME      : 10:26
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@RestController
@RequestMapping("api/v1/tasks")
public class TaskController {
    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public Iterable<Task> getTaskList(){
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task saveTask(@RequestBody Task task){
        return taskService.saveNewTask(task);
    }

    @PutMapping
    public Task updateTask(@RequestBody Task task){
        return taskService.saveNewTask(task);
    }
}
