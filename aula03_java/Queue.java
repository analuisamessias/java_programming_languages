package java_programming_languages.aula03_java;

public class Queue implements MyCollection {
  private Node front; // Primeiro elemento da fila
  private Node rear;  // Último elemento da fila

  public Queue() {
      this.front = null;
      this.rear = null;
  }

  // Adiciona um item no final da fila
  @Override
  public void add(String item) {
      Node newNode = new Node(item, null);
      if (isEmpty()) {
          // Se a fila estiver vazia, front e rear apontam para o mesmo nó
          this.front = newNode;
          this.rear = newNode;
      } else {
          // Caso contrário, adiciona no final e move o rear
          this.rear.setNext(newNode);
          this.rear = newNode;
      }
  }

  // Remove o item da frente da fila e o retorna
  @Override
  public String remove() {
      if (isEmpty()) {
          throw new IllegalStateException("A fila está vazia!");
      }

      String value = this.front.getValue();
      this.front = this.front.getNext();

      // Se o front ficar null, rear também deve ser null
      if (this.front == null) {
          this.rear = null;
      }

      return value;
  }

  // Verifica se a fila está vazia
  @Override
  public boolean isEmpty() {
      return this.front == null;
  }

  // Representação em string para depuração
  @Override
  public String toString() {
      StringBuilder result = new StringBuilder("[");
      for (Node curr = this.front; curr != null; curr = curr.getNext()) {
          result.append(curr.getValue()).append(", ");
      }
      if (!isEmpty()) {
          result.setLength(result.length() - 2); // Remove a última vírgula
      }
      result.append("]");
      return result.toString();
  }
}
