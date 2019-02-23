package xyz.tag.tasks.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.tag.tasks.domain.TaskDO;

/**
 * PROJECT   : tasks
 * PACKAGE   : xyz.tag.tasks.repo
 * USER      : sean
 * DATE      : 22-Fri-Feb-2019
 * TIME      : 10:26
 * E-MAIL    : kudzai@bcs.org
 * CELL      : +27-64-906-8809
 */
@Repository
public interface TaskRepo extends JpaRepository<TaskDO, Long> {

}
