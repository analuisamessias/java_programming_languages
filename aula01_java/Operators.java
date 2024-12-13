package java_programming_languages.aula01_java;

public class Operators{
  public static void main(String[] args){
      Integer a = 10;
      Integer b = a;
      Integer c = 20;

      System.out.println(a == 10);
      System.out.println(a == b);
      System.out.println(a == c);
      System.out.println("a" == "a");

      System.out.println(1<=2 && 2<=3);
      System.out.println(4<2 ? "yes" : "no");

      //A linha abaixo substitui o valor de a e b para c
      a=b=c;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(a == 10);

      // Chamadas de Classe
      String nome = "Maria";
      Integer idade = 22;
      System.out.println(String.valueOf(2==2)); //bool false como string
      System.out.println(String.valueOf(5*5)); //inteiro 25 como string
      System.out.println(String.format("%s: %d", nome, idade)); //string e idade como string

      for(int i = 0; i < 20; i++){
        if(i % 2 == 0){
            System.out.println("Par");
        }
        else{
          System.out.println("Impar");
      }
      }
  }
}

