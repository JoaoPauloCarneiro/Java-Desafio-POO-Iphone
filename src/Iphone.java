import java.util.Scanner;
import src.Reprodutor;
import src.aparelhoTelefonico;
import src.navegadorInternet;

public class Iphone {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        System.out.println ("----------------- Bem Vindo ao Iphone -----------------");
        System.out.println("Digite: 1 para Reprodutor de Musica," + " 2 para Opções de Telefone," + " 3 para Nagedor de Internet:");
        int numero = opcao.nextInt();
        contar(numero);
        }
    private static void contar(int numero) {
        Scanner opcao = new Scanner(System.in);
        if (numero == 1) {
            System.out.print("Voce Deseja: 1 Tocar a Música" + " 2 Pausar a Música" + " 3 Selecionar a Música: ");
            int opcao1 = opcao.nextInt();
            if (opcao1 == 1) {
                System.out.print("Você Está Ouvindo Música.");
            }
            if (opcao1 == 2) {
                System.out.print("Você Pausou a Música.");
            } else if (opcao1 == 3) {
                System.out.print("Você Deseja Selecionar Outra Musica.");
            }
        }

        if (numero == 2) {
            System.out.print("Voce Deseja: 1 Ligar," + " 2 Atender," + " 3 Iniciar Correio de Voz: ");
            int opcao2 = opcao.nextInt();
            if (opcao2 == 1) {
                System.out.print("Você está Ligando.");
            }
            if (opcao2 == 2) {
                System.out.print("Você está Atendendo uma Ligação.");
            } else if (opcao2 == 3) {
                System.out.print("Você está Ligando para o Correio de Voz.");
            }
        }
        if (numero == 3) {
            System.out.print("Voce Deseja: 1 Exibir Uma Pagina," + " 2 Adicionar uma Nova Aba," + " 3 Atualizar a Pagina: ");
            int opcao3 = opcao.nextInt();
            if (opcao3 == 1) {
                System.out.print("A Pagina está sendo Exibida.");
            }
            if (opcao3 == 2) {
                System.out.print("Nova Aba...");
            } else if (opcao3 == 3) {
                System.out.print("Atualizando Pagina...");
            }
        }

    }
}

