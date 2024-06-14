import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {
    double x = 0, y = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite as coordenadas");
    x = sc.nextDouble();
    y = sc.nextDouble();
    if (x == 0 && y != 0) {
      System.out.println("Eixo Y");
    } else if (y == 0 && x != 0) {
      System.out.println("Eixo X");
    } else if (x > 0 && y > 0) {
      System.out.println("Q1");
    } else if (x < 0 && y > 0) {
      System.out.println("Q2");
    } else if (x < 0 && y < 0) {
      System.out.println("Q3");
    } else if (x > 0 && y < 0) {
      System.out.println("Q4");
    } else {
      System.out.println("Origem");
    }
  }
}
