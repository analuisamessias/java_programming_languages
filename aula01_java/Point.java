package java_programming_languages.aula01_java;
public class Point {
  Integer x;
  Integer y;
    public Point(int x, int y){
      this.x = x;
      this.y = y;
    }
    public Point(){
      this(0,0);
    }


public static void main(String[] args) {
    Point P1 = new Point(1,2);
    Point P2 = P1;
    Point P3 = new Point(3,4);
    System.out.println(P1.x);
    System.out.println(P1.y);
    System.out.println(P2.x);
    System.out.println(P2.y);
    System.out.println(P3.x);
    System.out.println(P3.y);
}
}

