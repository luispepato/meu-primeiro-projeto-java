import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] idades = new int[10];

        int contador = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    if (contador < 10) {
                        System.out.print("Digite o nome: ");
                        nomes[contador] = sc.nextLine();

                        System.out.print("Digite a idade: ");
                        idades[contador] = sc.nextInt();
                        sc.nextLine();

                        contador++;

                        System.out.println("Pessoa cadastrada com sucesso!");
                    } else {
                        System.out.println("Limite de cadastro atingido!");
                    }

                    break;

                case 2:

                    if (contador == 0) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        System.out.println("\n===== LISTA DE PESSOAS =====");

                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + " - Nome: " + nomes[i] +
                                    " | Idade: " + idades[i]);
                        }
                    }

                    break;

                case 3:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 3);

        sc.close();
    }
}