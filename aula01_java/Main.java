package java_programming_languages.aula01_java;

public class Main{
  public static void main(String[] args){
    IntList a = new IntList(null);
    IntList b = a.cons(2);
    IntList c = b.cons(3);
    int l = a.length() + b.length() + c.length();
    
    System.out.println(l);
  }
}
