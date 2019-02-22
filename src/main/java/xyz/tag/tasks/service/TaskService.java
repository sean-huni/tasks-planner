package xyz.tag.tasks.service;

import xyz.tag.tasks.domain.Task;

import java.util.Collection;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.service
 * USER      : sean
 * DATE      : 22-Fri-Feb-2019
 * TIME      : 10:27
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */

public interface TaskService {
    /**
     * Gets a list of all the {@link  Iterable<Task>}
     * @return {@link  Iterable<Task>}
     */
    Iterable<Task> getAllTasks();

    /**
     * Save all {@link Iterable<Task>}
     * @param tasks all tasks to be saved.
     * @return Saved {@link Iterable<Task>}
     */
    Iterable<Task> saveAllTasks(Collection<Task> tasks);

    /**
     * Save a new task.
     *
     * @param task task to be saved.
     * @return saved task.
     */
    Task saveNewTask(Task task);

    /**
     * Update an existing {@link Task}
     *
     * @param task to be updated
     * @return updated task.
     */
    Task updateTask(Task task);

    /**
     * Task to be deleted.
     * @param id of the {@link Task} to be deleted.
     */
    void deleteTask(Long id);

}
