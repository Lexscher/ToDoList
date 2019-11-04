public class Main {
  public static void main(String[] args) {
    Task task1 = new Task("Drink water");
    Task task2 = new Task("Do one push-up");
    Task task3 = new Task("Do one squat");
    Task task4 = new Task("Drink more water");

    System.out.println("Task 1: " + task1.getContent() + " complete? " + task1.getComplete());
    System.out.println("Task 2: " + task2.getContent() + " complete? " + task2.getComplete());
    System.out.println("Task 3: " + task3.getContent() + " complete? " + task3.getComplete());
    System.out.println("Task 4: " + task4.getContent() + " complete? " + task4.getComplete());
  }
}