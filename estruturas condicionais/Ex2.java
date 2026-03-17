import java.util.Scanner;
    public class Ex2{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número inteiro: ");
            int n1 = scanner. nextInt();

            System.out.println("Digite o segundo número inteiro: ");
            int n2 = scanner. nextInt(); 

            System.out.println((n1 > n2)? "O primeiro número é maior que o segundo": "O segundo número é maior que o primeiro");
            scanner.close();
    }
    }