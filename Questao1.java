import java.util.Scanner;
public class Questao1 {

    public static void main(String[] args) {

        int matricula = 0001;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = ler.nextLine();
        System.out.println("Digite o nome da sua disciplina");
        String disciplina = ler.nextLine();
        System.out.println("nome: " + nome + "\n" + "Matricula: " + matricula);
        System.out.println("Disciplina: " + disciplina);

    }
    
}