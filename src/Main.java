public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new Task("Tache 1", "Description de la tache 1"));
        taskManager.addTask(new Task("Tache 2", "Description de la tache 2"));
        taskManager.addTask(new Task("Tache 3", "Description de la tache 3"));

        taskManager.markTaskAsComplete(1);

        TaskReport report = new TaskReport(taskManager.getTasks());

        report.printReport();

    }
}
