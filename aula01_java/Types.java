package java_programming_languages.aula01_java;

public class Types{
  public static void main (String[] args){
    // Tipos primitivos
    int a = 10;
    double b = 10.5;
    char c = 'a';
    boolean d = true;
    char e = (char)105; // Letra 'i' em ASCII

    //Tipos não primitivos
    String nome = "Aninha";

    //Para imprimir use System.out.println
    System.out.println("Hello World");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);

    System.out.println(nome);
    System.out.println("Tamanho do nome Aninha: " + nome.length());
    System.out.println(nome.charAt(4));
    System.out.println(nome.toUpperCase());

    //Operações
    System.out.println(1+2*3);
    System.out.println(15/7);
    System.out.println(15.0/7.0);
    System.out.println(15%7);

    //Concatenação
    System.out.println("Hello" + " " + "World");
    System.out.println("123" + "456");
    System.out.println("" + (1.0/2.0));
    System.out.println(1 + "2");
    System.out.println(1 + "2" + 3);
    System.out.println(1 + 2 + "3");

    String k = "Linguagens";
    String l = "Programação";
    System.out.println(k.length());
    System.out.println(k.equals(l));
    System.out.println(l.equals(k));
    System.out.println(l.compareTo(k));
    System.out.println(k.toUpperCase());
    System.out.println(l.toLowerCase());
    System.out.println(l.toUpperCase().charAt(3));
  }
}
