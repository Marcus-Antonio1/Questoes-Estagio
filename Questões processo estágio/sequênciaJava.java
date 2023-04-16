import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
    int num = input.nextInt();

    int primeiro = 0;
    int segundo = 1;
    int proximo;

    while (segundo < num) {
      proximo = primeiro + segundo;
      primeiro = segundo;
      segundo = proximo;
    }

    if (segundo == num) {
      System.out.println(num + " pertence à sequência de Fibonacci.");
    } else {
      System.out.println(num + " não pertence à sequência de Fibonacci.");
    }
  }
}