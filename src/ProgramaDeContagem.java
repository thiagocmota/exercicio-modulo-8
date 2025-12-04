import java.util.Scanner;

public class ProgramaDeContagem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, por favor digite o seu nome.");
        String nomeUsuario = scanner.next();

        int numeroUsuario = 1;
        System.out.println("Agora digite um número positivo maior que 0.");

        while (true) {
            numeroUsuario = scanner.nextInt();
            if (numeroUsuario > 0) {
                contagemCrescente(numeroUsuario);
                contagemDecrescente(numeroUsuario);
                verificaTamanhoNome(nomeUsuario, numeroUsuario);
                break;
            } else {
                System.out.println("Você digitou um número invalido, digite um número positivo maior que 0.");
            }

        }
        scanner.close();
        System.out.println();


    }

    private static void verificaTamanhoNome(String nomeUsuario, int numeroUsuario) {
        if (nomeUsuario.length() > 6) {
            for (int n1 = numeroUsuario; n1 > 0; n1--) {
                System.out.println("\n" + nomeUsuario);
            }
        } else {
            System.out.println("\n" + nomeUsuario);
        }
        System.out.println();
    }

    private static void contagemDecrescente(int numeroUsuario) {
        System.out.println("\nContagem decrescente do número escolhido.\n");
        for (int n1 = numeroUsuario; n1 >= 0; n1--) {
            System.out.println(n1);
        }
    }

    private static void contagemCrescente(int numeroUsuario) {
        System.out.println("\nContagem crescente do número escolhido.\n");
        for (int n1 = 0; n1 <= numeroUsuario; n1++) {
            System.out.println(n1);
        }
    }

}
