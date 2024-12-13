package java_programming_languages.aula03_java;

/* public class Main{
  public static void main(String[] args){
      FormaGeometrica retangulo;
      retangulo = new Retangulo(2, 4);
      System.out.println("Área: " + retangulo.area());
      System.out.println("Perímetro: " + retangulo.perimetro());

      FormaGeometrica circulo;;
      circulo = new Circulo(3.12);
      System.out.println("Área: " + circulo.area());
      System.out.println("Perímetro: " + circulo.perimetro());
  }
}
  */


  public class Main {
    public static void main(String[] args) {
        MyCollection q = new Queue();

        q.add("Primeiro");
        q.add("Segundo");
        q.add("Terceiro");

        System.out.println("Fila inicial: " + q);

        while (!q.isEmpty()) {
            System.out.println("Removido: " + q.remove());
            System.out.println("Fila após remoção: " + q);
        }
    }
}
