import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o raio da circuferência");
    float r = ler.nextFloat();
    double pi = 3.14;
    System.out.println("Comprimento é = " +  2 * pi * r + "cm");
    System.out.println("A área do circulo é = " + (pi) * (r*r) + "m²");
    }
    
}
