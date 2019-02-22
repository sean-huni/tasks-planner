package xyz.tag.tasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import xyz.tag.tasks.domain.Task;
import xyz.tag.tasks.service.TaskService;

import java.time.LocalDateTime;
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
            Collection<Task> taskCollection = new ArrayList<>();
            taskCollection.add(new Task(1L, "Create Spring Boot App", LocalDateTime.now(), true));
            taskCollection.add(new Task(2L, "Create Spring Project Packages", LocalDateTime.now().plus(1, ChronoUnit.DAYS), false));
            taskCollection.add(new Task(3L, "Create Task Domain Class", LocalDateTime.now().plus(1, ChronoUnit.DAYS), false));
            taskCollection.add(new Task(4L, "Create the service & repo classes", LocalDateTime.now().plus(1, ChronoUnit.DAYS), false));
            taskCollection.add(new Task(5L, "Create dummy data", LocalDateTime.now().plus(1, ChronoUnit.DAYS), false));
            taskCollection.add(new Task(6L, "Verify H2-DB  init-data", LocalDateTime.now().plus(1, ChronoUnit.DAYS), false));

            taskService.saveAllTasks(taskCollection);
        };
    }
}
