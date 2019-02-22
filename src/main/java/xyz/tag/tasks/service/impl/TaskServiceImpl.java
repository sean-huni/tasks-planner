package xyz.tag.tasks.service.impl;

import org.springframework.stereotype.Service;
import xyz.tag.tasks.domain.Task;
import xyz.tag.tasks.repo.TaskRepo;
import xyz.tag.tasks.service.TaskService;

import java.util.Collection;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.service.impl
 * USER      : sean
 * DATE      : 22-Fri-Feb-2019
 * TIME      : 10:27
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@Service
public class TaskServiceImpl implements TaskService {
    private TaskRepo taskRepo;

    public TaskServiceImpl(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    /**
     * Gets a list of all the {@link  Iterable<Task>}
     *
     * @return {@link  Iterable<Task>}
     */
    @Override
    public Iterable<Task> getAllTasks() {
        return taskRepo.findAll();
    }

    /**
     * Save all {@link Iterable<Task>}
     *
     * @param tasks all tasks to be saved.
     * @return Saved {@link Iterable<Task>}
     */
    @Override
    public Iterable<Task> saveAllTasks(Collection<Task> tasks) {
        return taskRepo.saveAll(tasks);
    }

    /**
     * Save a new task.
     *
     * @param task task to be saved.
     * @return saved task.
     */
    @Override
    public Task saveNewTask(Task task) {
        return taskRepo.save(task);
    }

    /**
     * Update an existing {@link Task}
     *
     * @param task to be updated
     * @return updated task.
     */
    @Override
    public Task updateTask(Task task) {
        return taskRepo.save(task);
    }

    /**
     * Task to be deleted.
     *
     * @param id of the {@link Task} to be deleted.
     */
    @Override
    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }
}
