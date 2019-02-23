package xyz.tag.tasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import xyz.tag.tasks.dto.TaskDTO;
import xyz.tag.tasks.service.TaskService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks
 * USER      : sean
 * DATE      : 22-Fri-Feb-2019
 * TIME      : 20:16
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@SpringBootApplication
public class TasksSpringApp {
    public static void main(String[] args) {
        SpringApplication.run(TasksSpringApp.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            Collection<TaskDTO> taskCollection = new ArrayList<>();
            taskCollection.add(new TaskDTO(1L, "Create Spring Boot App", LocalDate.now(), true));
            taskCollection.add(new TaskDTO(2L, "Create Spring Project Packages", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskCollection.add(new TaskDTO(3L, "Create Task Domain Class", LocalDate.now().plus(6, ChronoUnit.DAYS), false));
            taskCollection.add(new TaskDTO(4L, "Create the service & repo classes", LocalDate.now().plus(6, ChronoUnit.DAYS), false));
            taskCollection.add(new TaskDTO(5L, "Create dummy data", LocalDate.now().plus(3, ChronoUnit.DAYS), false));
            taskCollection.add(new TaskDTO(6L, "Verify H2-DB  init-data", LocalDate.now().plus(4, ChronoUnit.DAYS), false));

            taskService.saveAllTasks(taskCollection);
        };
    }
}
