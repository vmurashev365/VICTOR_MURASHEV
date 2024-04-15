package homework_nr_8;

import java.util.ArrayList;
import java.util.HashSet;

public class tasksForToday {
    public static void main(String[] args) {
        // Creating list of tasks for today
        ArrayList<String> tasksForToday = getTasksForToday();
        System.out.println("Full list of tasks to be done today: ");
        displayList(tasksForToday);

        // Returning list of unique tasks for today
        System.out.println("\nList of unique tasks for today: ");
        displayUniqueTasks(tasksForToday);

    }

    // Method of taking list of tasks for today
    public static ArrayList<String> getTasksForToday() {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Do homework");
        tasks.add("Walk in park and do fitness");
        tasks.add("Finish Jira items at work");
        tasks.add("View videos related to QA in Udemy");
        tasks.add("Do planned lessons in Busuu");
        tasks.add("Take a dinner");
        tasks.add("Read new in Telegram-channels");
        //repeating tasks
        tasks.add("Do planned lessons in Busuu");
        tasks.add("Take a dinner");
        return tasks;
    }

    // Method to display full list of the tasks based on Foreach loop
    public static void displayList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println("- " + item);
        }
    }

    // Method to display unique tasks
    public static void displayUniqueTasks(ArrayList<String> tasks) {
        HashSet<String> uniqueTasks = getUniqueValues(tasks);
        displayList(new ArrayList<>(uniqueTasks));

    }

    // Method to filter non-unique tasks
    public static HashSet<String> getUniqueValues(ArrayList<String> list) {
        return new HashSet<>(list);
    }

}
