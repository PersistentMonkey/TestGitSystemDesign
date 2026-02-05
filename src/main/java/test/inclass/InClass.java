/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.inclass;

/**
 *
 * @author akshat
 */
public class InClass {

    private String title;
    private boolean completed;

    public InClass(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markComplete() {
        completed = true;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
