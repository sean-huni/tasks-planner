package xyz.tag.tasks.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import xyz.tag.tasks.domain.TaskDO;
import xyz.tag.tasks.dto.TaskDTO;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.converter
 * USER      : sean
 * DATE      : 23-Sat-Feb-2019
 * TIME      : 03:24
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@Component
public class ToTaskDOConverter implements Converter<TaskDTO, TaskDO> {
    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    public TaskDO convert(TaskDTO source) {
        return new TaskDO(source.getId(), source.getName(), source.getDueDate(), source.getCompleted());
    }
}
