package xyz.tag.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.domain
 * USER      : sean
 * DATE      : 22-Fri-Feb-2019
 * TIME      : 10:26
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task", schema = "tasks")
public class TaskDO extends AuditingAbstract {
    private String name;
    private LocalDate dueDate;
    private Boolean completed;

    public TaskDO(Long id, String name, LocalDate dueDate, Boolean completed) {
        this.setId(id);
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskDO)) return false;
        TaskDO taskDO = (TaskDO) o;
        return getName().equals(taskDO.getName()) &&
                getDueDate().equals(taskDO.getDueDate()) &&
                Objects.equals(getCompleted(), taskDO.getCompleted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDueDate(), getCompleted());
    }
}
