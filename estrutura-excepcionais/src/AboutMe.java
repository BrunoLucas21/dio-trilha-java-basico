import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos pelo usuário
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Eu tenho " + idade + " anos.");
            System.out.println("E minha altura é " + altura + " cm.");
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("A idade e a altura devem ser númericos. Tente novamente.");
        }
    }
}
