import java.util.Scanner;
public class Questao4 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros");
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        System.out.println("Resulado "+ n1 % n2);

    }
    
}
