package xyz.tag.tasks.service;

import xyz.tag.tasks.dto.TaskDTO;

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
     * Gets a list of all the {@link  Iterable< TaskDTO >}
     *
     * @return {@link  Iterable< TaskDTO >}
     */
    Iterable<TaskDTO> getAllTasks();

    /**
     * Save all {@link Iterable< TaskDTO >}
     *
     * @param tasks all tasks to be saved.
     * @return Saved {@link Iterable< TaskDTO >}
     */
    Iterable<TaskDTO> saveAllTasks(Collection<TaskDTO> tasks);

    /**
     * Save a new task.
     *
     * @param task task to be saved.
     * @return saved task.
     */
    TaskDTO saveNewTask(TaskDTO task);

    /**
     * Update an existing {@link TaskDTO}
     *
     * @param task to be updated
     * @return updated task.
     */
    TaskDTO updateTask(TaskDTO task);

    /**
     * Task to be deleted.
     *
     * @param id of the {@link TaskDTO} to be deleted.
     */
    void deleteTask(Long id);

}
