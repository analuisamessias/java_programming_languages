package java_programming_languages.aula01_java;
public class Factorial {
  public static int fact (int n){
    int f = 1;
    while(n > 0)
      f = f * n--;
      return f;
}

public static void main(String[] args){
  System.out.println(fact(5));
}
}