package java_programming_languages.aula03_java;

public class Stack implements MyCollection {
  protected Node top = null;

  public void add(String data) {
      this.top = new Node(data, top);
  }
  public String remove() {
      String value = this.top.getValue();
      this.top = this.top.getNext();

      return value;
  }
  public boolean isEmpty() {
      return this.top == null;
  }
  @Override
  public String toString() {
      Node topCopy = this.top;
      String result = "[";
      for(Node curr = this.top; curr != null; curr = curr.getNext())
          result += curr.getValue() + ",";
      result += "]";
      return result;
  }
}