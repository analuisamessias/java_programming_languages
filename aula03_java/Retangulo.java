package java_programming_languages.aula03_java;

public class Retangulo implements FormaGeometrica{
  private int base;
  private int altura;
  public Retangulo(int base, int altura){
      this.base = base;
      this.altura = altura;
  }
  @Override
  public double area(){
      return base * altura;
  }

  @Override
  public double perimetro(){
      return 2 * (base + altura);
  }
}

