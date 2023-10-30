package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Component.Task;
import com.example.demo.Exception.TaskNotFoundException;

import org.springframework.stereotype.Service;

@Service
public class TaskService {

	private List<Task> tasks = new ArrayList<>();

	
	public List<Task> getAllTasks() {
		return tasks;
	}
	
	public Task createTask(Task task) {
		task.setId((long) (tasks.size() + 1));
		tasks.add(task);
		return task;
	}
	
	public Task updateTask(Task updatedTask) {
	    for (int i = 0; i < tasks.size(); i++) {
	        Task task = tasks.get(i);
	        if (task.getId().equals(updatedTask.getId())) {
	            task.setTitel(updatedTask.getTitel());
	            task.setDescription(updatedTask.getDescription());
	            task.setCompleted(updatedTask.isCompleted());
	            return task; // Return the updated task
	        }
	    }

	    throw new TaskNotFoundException("Task not found with ID: " + updatedTask.getId());
	}
	public void deleteTask(Long id) {
		tasks.removeIf(task -> task.getId().equals(id));
	}
	
}
