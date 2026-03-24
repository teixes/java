import java.util.Scanner;
    public class Ex6{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o ano para saber se ele é bissexto ou não: ");
            int a = scanner. nextInt();

            System.out.println((a % 4 == 0 && a % 100 != 0 || a % 400 == 0)? "O ano " + a +" é bissexto ": "O ano " + a +" não é bissexto");
            scanner.close();
    }
    }