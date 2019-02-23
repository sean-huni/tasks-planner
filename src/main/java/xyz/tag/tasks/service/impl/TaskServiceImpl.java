package xyz.tag.tasks.service.impl;

import org.springframework.stereotype.Service;
import xyz.tag.tasks.converter.ToTaskDOConverter;
import xyz.tag.tasks.converter.ToTaskDTOConverter;
import xyz.tag.tasks.domain.TaskDO;
import xyz.tag.tasks.dto.TaskDTO;
import xyz.tag.tasks.repo.TaskRepo;
import xyz.tag.tasks.service.TaskService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

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
    private ToTaskDOConverter toTaskDOConverter;
    private ToTaskDTOConverter toTaskDTOConverter;

    public TaskServiceImpl(TaskRepo taskRepo, ToTaskDOConverter toTaskDOConverter, ToTaskDTOConverter toTaskDTOConverter) {
        this.taskRepo = taskRepo;
        this.toTaskDOConverter = toTaskDOConverter;
        this.toTaskDTOConverter = toTaskDTOConverter;
    }

    /**
     * Gets a list of all the {@link  Iterable< TaskDO >}
     *
     * @return {@link  Iterable< TaskDO >}
     */
    @Override
    public Iterable<TaskDTO> getAllTasks() {
        return taskRepo.findAll().stream().map(taskDO -> toTaskDTOConverter.convert(taskDO)).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Save all {@link Iterable< TaskDO >}
     *
     * @param tasks all tasks to be saved.
     * @return Saved {@link Iterable< TaskDO >}
     */
    @Override
    public Iterable<TaskDTO> saveAllTasks(Collection<TaskDTO> tasks) {
        return taskRepo.saveAll(tasks.stream().map(taskDTO -> toTaskDOConverter.convert(taskDTO)).collect(Collectors.toCollection(ArrayList::new)))
                .stream().map(s -> toTaskDTOConverter.convert(s)).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Save a new task.
     *
     * @param task task to be saved.
     * @return saved task.
     */
    @Override
    public TaskDTO saveNewTask(TaskDTO task) {
        return toTaskDTOConverter.convert(taskRepo.save(toTaskDOConverter.convert(task)));
    }

    /**
     * Update an existing {@link TaskDTO}
     *
     * @param task to be updated
     * @return updated task.
     */
    @Override
    public TaskDTO updateTask(TaskDTO task) {
        return toTaskDTOConverter.convert(taskRepo.save(toTaskDOConverter.convert(task)));
    }

    /**
     * Task to be deleted.
     *
     * @param id of the {@link TaskDTO} to be deleted.
     */
    @Override
    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }
}
