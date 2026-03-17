import java.util.Scanner;
    public class Ex4{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a temperatura em graus celsius: ");
            int t = scanner. nextInt();
            if (t < 15){
                System.out.println("A temperatura está fria") ;
            } 
            else if (t >= 15 && t < 25){
                System.out.println("A temperatura está agradável") ;
            } 
            else {
                System.out.println("A temperatura está quente") ;
            }
                  scanner.close();
    }
    }