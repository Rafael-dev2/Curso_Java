
import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {
    int num = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número");
    num = sc.nextInt();
    if (num >= 0) {
      System.out.println("NAO NEGATIVO");
    } else {
      System.out.println("NEGATIVO");
    }
    sc.close();
  }
}
