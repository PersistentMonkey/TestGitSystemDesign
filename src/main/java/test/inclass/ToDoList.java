/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.inclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gun78
 */
public class ToDoList {
    private final List<InClass> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new InClass(title));
    }

    public void deleteTask(int index) {
        tasks.remove(index);
    }

    public void updateTask(int index, String newTitle) {
        tasks.get(index).setTitle(newTitle);
    }

    public void markTaskComplete(int index) {
        tasks.get(index).markComplete();
    }

    public List<InClass> getTasks() {
        return tasks;
    }
}