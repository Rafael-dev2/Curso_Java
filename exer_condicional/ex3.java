import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    int num1 = 0, num2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite dois números");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if (num2 % num1 == 0 || num1 % num2 == 0) {
      System.out.println("Sao Multiplos");
    } else {
      System.out.println("Nao sao Multiplos");
    }
  }
}
