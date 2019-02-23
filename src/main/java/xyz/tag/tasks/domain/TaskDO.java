package xyz.tag.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task", schema = "tasks")
public class TaskDO {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate dueDate;
    private Boolean completed;

}
