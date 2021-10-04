import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = ler.nextInt();
        
        if ((n1 % 5) == 0) {
            System.out.println(n1 + " e 5 são multiplos" );
        }else{
            System.out.println(n1 + " e 5 não são multiplos" );
        }

    }
    
}
