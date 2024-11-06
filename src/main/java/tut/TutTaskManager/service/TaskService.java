package tut.TutTaskManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.TutTaskManager.model.Task;
import tut.TutTaskManager.repository.TaskRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task addTask(Task task){
        return taskRepository.save(task);
    }
    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }
   public Task updateTask(Long id,Task task){
        task.setId(id);
       return taskRepository.save(task);
   }
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
