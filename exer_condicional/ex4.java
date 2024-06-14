import java.util.Scanner;

public class ex4 {
  public static void main(String[] args) {
    int num1 = 0, num2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a hora de inicio e fim do jogo");
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    if (num1 > num2) {
      System.out.printf("O JOGO DUROU %d HORA(S)", (24 - num1 + num2));
    } else if (num2 > num1) {
      System.out.printf("O JOGO DUROU %d HORA(S)", (num2 - num1));
    } else {
      System.out.printf("O JOGO DUROU 24 HORA(S)\n");
    }
  }
}
