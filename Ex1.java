import java.util.Scanner;
    public class Ex1{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o número para saber se ele é par ou impar");
            int a = scanner. nextInt();

            System.out.println((a % 2 == 0)? "O número exibido é par": "O número exibido é ímpar");
            scanner.close();
    }
    }