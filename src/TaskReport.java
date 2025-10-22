import java.util.List;

public class TaskReport {

    private final List<Task> tasks;

    public TaskReport(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void printCompletedTasks() {
        System.out.println("Taches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printPendingTasks() {
        System.out.println("Taches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printReport() {
        printCompletedTasks();
        printPendingTasks();
    }
}
