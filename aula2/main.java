import java.util.Scanner;

public class main.java{
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        String nome;
        String idade;
        String celular;
    
        String dataNascimento;
        String endereco;
        String email;
        int opcaoPlano;

        String[] plano = {"Mensal", "Semestral", "Anual"};
        double[] precosPlanos = {56.23, 169.56, 256.23};

        System.out.println("Digite seu nome: ");
        nome = usuario.nextLine();
        System.out.println("nome informado: " + nome);

        System.out.println("Digite sua idade: ");
        idade = usuario.nextLine();
        System.out.println("idade informada: " + idade);

        System.out.println("Digite seu celular: ");
        celular = usuario.nextLine();
        System.out.println("celular informado: " + celular);

        System.out.println("Digite sua data de nascimento (AAAA-MM-DD): ");
        dataNascimento = usuario.nextLine();
        System.out.println("data de nascimento informada: " + dataNascimento);

        System.out.println("Digite seu endereço: ");
        endereco = usuario.nextLine();
        System.out.println("endereço informado: " + endereco);

        System.out.println("Digite seu email: ");
        email = usuario.nextLine();
        System.out.println("email informado: " + email);

        System.out.println("Informe o número do plano que deseja contratar:");
        for (int i = 0; i < plano.length; i++) {
            System.out.println((i + 1) + " - " + plano[i] + " R$" + precosPlanos[i]);
        }
        opcaoPlano = Integer.parseInt(usuario.nextLine());

        if (opcaoPlano < 1 || opcaoPlano > plano.length) {
            System.out.println("Plano inválido!");
            usuario.close();
            return;
        }
        System.out.println("plano informado: " + plano[opcaoPlano - 1]);

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Celular: " + celular);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
        System.out.println("Plano Contratado: " + plano[opcaoPlano - 1]
                + " (R$" + precosPlanos[opcaoPlano - 1] + ")");

        System.out.println("✅ O cliente " + nome + " foi registrado com sucesso!");

        usuario.close();
    }
}
