package xyz.tag.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

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
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dueDate;
    private Boolean completed;

}
