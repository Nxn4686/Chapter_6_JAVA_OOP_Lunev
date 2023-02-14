package TasksPlanner;

import Tasks.ITask;
import Tasks.Task;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import netscape.javascript.JSObject;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.simple.JSONObject;
//import org.json.simple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Planner {
    private static int count = 0;
    private List<Task> taskList;
    private ITask currentTask;

    public Planner() {
        taskList = new ArrayList<>();
    }

    public Planner(Task task) {
        this();
        taskList.add(task);
        count++;
    }

    public int getCount() {

        return count;
    }

    public ITask getCurrentTask() {

        return currentTask;
    }

    public void setCurrentTask(Task task) {
        if (!taskList.contains(task)) {
            addTask(task);
        }
        currentTask = task;
    }

    public void addTask(Task task) {
        this.taskList.add(task);
        count++;
    }

    public void showAll() {
        for (ITask task : taskList) {
            task.showInfo();
        }
    }

    public void exportToCSV() throws IOException {
        FileWriter csvWriter = new FileWriter("tasks.csv");
        csvWriter.append("ID,created,deadline,author,description,priority\n");
        for (Task task : taskList) {
            csvWriter.append(String.format("%s, %s, %s, %s, %s,%s\n",
                    task.getId(),
                    task.getCreationDate(),
                    task.getDeadLine(),
                    task.getAuthor(),
                    task.getDescription(),
                    task.getPriority()));
        }
        csvWriter.flush();
        csvWriter.close();
    }

}
