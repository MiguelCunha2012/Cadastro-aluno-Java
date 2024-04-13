import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Aluno");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();


        Aluno aluno = new Aluno(nome, endereco, telefone, email, matricula);
        
        System.out.println("\nAluno cadastrado com sucesso:");
        aluno.exibirInformacoes();

        scanner.close();

      
    } 

}
