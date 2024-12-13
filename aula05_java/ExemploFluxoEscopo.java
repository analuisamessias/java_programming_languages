package java_programming_languages.aula05_java;

public class ExemploFluxoEscopo {

    public static void f(){
        System.out.println("1.1, ");
        String s = null;
        s.length();
        System.out.println("1.2, ");
    }

    public static void main(String[] args) {
      System.out.print("1, ");
      try {
      f();
      } catch (NullPointerException e) {
      System.out.print("2, ");
      }
      System.out.println("3");
    }
}
