/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test.inclass;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gun78
 */
public class ToDoListTest {
    

    @Test
    public void testAddTask() {
          ToDoList list = new   ToDoList();

        list.addTask("Study Comp SCi");

        assertEquals(1, list.getTasks().size());
        assertEquals("Study Comp SCi", list.getTasks().get(0).getTitle());
    }

    @Test
    public void testDeleteTask() {
          ToDoList list = new   ToDoList();
        list.addTask("Task 1");
        list.addTask("Task 2");

        list.deleteTask(0);

        assertEquals(1, list.getTasks().size());
        assertEquals("Task 2", list.getTasks().get(0).getTitle());
    }

    @Test
    public void testUpdateTask() {
          ToDoList list = new   ToDoList();
        list.addTask("Old Task");

        list.updateTask(0, "New Task");

        assertEquals("New Task", list.getTasks().get(0).getTitle());
    }

    @Test
    public void testMarkComplete() {
        ToDoList list = new ToDoList();
        list.addTask("Finished the in class");

        list.markTaskComplete(0);

        assertTrue(list.getTasks().get(0).isCompleted());
    }
}
