package java_programming_languages.aula03_java;
public class Node{
    private String data;
    private Node next;
    public Node(String data, Node next){
        this.data = data;
        this.next = null;
    }
    public String getValue(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}

