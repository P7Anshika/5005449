package Exercise5;

class Node {
    Task task;
    Node next;

    Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManager {
    private Node head;

    // Add a task
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Search for a task
    public Task searchTask(String taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId().equals(taskId)) {
                return current.task;
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Traverse and display all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task
    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("1", "Task 1", "Pending"));
        manager.addTask(new Task("2", "Task 2", "Completed"));
        manager.addTask(new Task("3", "Task 3", "In Progress"));

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for Task 2:");
        Task task = manager.searchTask("2");
        System.out.println(task != null ? task : "Task not found");

        System.out.println("\nDeleting Task 2:");
        manager.deleteTask("2");
        manager.traverseTasks();
    }
}
