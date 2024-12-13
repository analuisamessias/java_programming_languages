package java_programming_languages.aula05_java;

public class TestException {
  public static void main(String[] args) {
  try{
      int i = Integer.parseInt(args[0]);
      int j = Integer.parseInt(args[1]);
      System.out.println(i / j);
    }catch(ArithmeticException ex){
      System.out.println("Erro");
  }
    catch(ArrayIndexOutOfBoundsException ex){
      System.out.println("Erro");
    }
    catch(NumberFormatException ex){
      System.out.println("Erro");
    }
} 
}
