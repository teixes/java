import java.util.Scanner;
    public class Ex3{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a sua média: ");
            int m = scanner. nextInt();
            if (m >= 7){
                System.out.println("Parabéns, você foi aprovado!") ;
            } 
            else if (m >= 5 && m < 7){
                System.out.println("você está de recuperação!") ;
            } 
            else {
                System.out.println("Você foi reprovado!") ;
            }
                  scanner.close();
    }
    }