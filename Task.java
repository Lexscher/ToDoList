public class Task {
  private static String content;
  private static boolean complete;

  public Task(String initalizedContent) {
    content = initalizedContent;
    complete = false;
  }

  // Getters
  public String getContent() {
    return content;
  }

  public boolean getComplete() {
    return complete;
  }

  // Setters
  public void setContent(String newContent) {
    content = newContent;
  }

  public void setComplete(String newComplete) {
    complete = newComplete;
  }

}