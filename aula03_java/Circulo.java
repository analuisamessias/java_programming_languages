package java_programming_languages.aula03_java;
public class Circulo implements FormaGeometrica{
  private double raio;
  public Circulo(double raio){
      this.raio = raio;
  }
  @Override
  public double area(){
      return Math.PI * Math.pow(this.raio, 2);
  }
  @Override
  public double perimetro(){
      return 2 * Math.PI * raio;
  }
}

