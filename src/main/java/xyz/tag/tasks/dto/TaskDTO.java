package xyz.tag.tasks.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dueDate;
    private Boolean completed;

}
