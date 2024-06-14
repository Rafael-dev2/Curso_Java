import java.util.Scanner;

public class ex5 {
  public static void main(String[] args) {
    int num1 = 0, num2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o código do item e a quantidade");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if (num1 == 1) {
      System.out.printf("Total: R$ %.2f", (4.0 * num2));
    } else if (num1 == 2) {
      System.out.printf("Total: R$ %.2f", (4.5 * num2));
    } else if (num1 == 3) {
      System.out.printf("Total: R$ %.2f", (5.0 * num2));
    } else if (num1 == 4) {
      System.out.printf("Total: R$ %.2f", (2.0 * num2));
    } else {
      System.out.printf("Total: R$ %.2f", (1.5 * num2));
    }
  }
}
