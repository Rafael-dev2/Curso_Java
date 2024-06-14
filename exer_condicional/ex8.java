import java.util.Scanner;

public class ex8 {
  public static void main(String[] args) {
    double renda = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite sua Renda");
    renda = sc.nextDouble();
    if (renda <= 2000) {
      System.out.println("Isento");
    } else if (renda > 2000 && renda <= 3000) {
      System.out.println("R$ " + ((renda - 2000) * 0.08));
    } else if (renda > 3000 && renda <= 4500) {
      System.out.println("R$ " + (1000 * 0.08 + (renda - 3000) * 0.18));
    } else if (renda > 4500) {
      System.out.println("R$ " + ((1000 * 0.08) + (1500 * 0.18) + (renda - 4500) * 0.28));
    }
    sc.close();
  }
}
