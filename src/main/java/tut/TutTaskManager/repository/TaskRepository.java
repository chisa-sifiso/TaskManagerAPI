package tut.TutTaskManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tut.TutTaskManager.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
