package java_programming_languages.aula01_java;

public class IntList {
  private ConsCell first;

  public IntList(ConsCell s){
    this.first = s;
  }

  public IntList cons(int v){
    ConsCell newCell = new ConsCell(v, first);
    return new IntList(newCell);
  }

  public int length(){
    int len = 0;
    for(ConsCell c = first; c != null; c = c.getTail())
      len++;
    return len;
  }
}

class ConsCell {
  private int head;
  private ConsCell tail;

  public ConsCell(int head, ConsCell tail) {
    this.head = head;
    this.tail = tail;
  }

  public int getHead() {
    return head;
  }

  public ConsCell getTail() {
    return tail;
  }
}
