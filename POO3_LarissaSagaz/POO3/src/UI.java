import java.util.Scanner;

public class UI {
    Cadastro cadastro = new Cadastro();
    String novoArquivo;
    Scanner scanIntFloat = new Scanner(System.in);
    Scanner scanString = new Scanner(System.in);

    public void executa() throws DadosAbertosException {
        char opcao = ' ';
        while (opcao != '0') {
            System.out.println("Opcoes: ");
            System.out.println("   [0] Sair do programa");
            System.out.println("   [1] Carregar todos os dados");
            System.out.println("   [2] Apresenta dados");
            System.out.println("   [3] Consulta por logradouro");
            System.out.println("   [4] Salvar os dados da consulta");
            System.out.print("Digite a opcao desejada: ");
            opcao = scanIntFloat.next().charAt(0);
            switch (opcao) {
                case '1':
                    carregaDados();
                    break;
                case '2':
                    mostraDados();
                    break;
                case '3':
                    consultaEndereco();
                    break;
                case '4':
                    salvaArquivo();
                case '0':
                    break;
                default:
                    System.out.println("Opcao invalida! Redigite.");
            }
        }
    }
    private void carregaDados() throws DadosAbertosException {
        System.out.println("Qual nome do arquivo voce deseja carregar?");
        String filename = scanString.nextLine();
        cadastro.recebeArquivo(filename);
        System.out.println("Arquivo carregado.");
    }

    private void mostraDados() throws DadosAbertosException {
        cadastro.printaDados();
    }

    private void consultaEndereco() throws DadosAbertosException {
        System.out.println("Qual endereço voce procura?");
        String input_log = scanString.nextLine();
        cadastro.procuraLog(input_log);
    }

    private void salvaArquivo() throws DadosAbertosException {
        System.out.println("Qual o nome do arquivo?");
        novoArquivo = scanString.nextLine();
        cadastro.gravaArquivo(novoArquivo);
    }
}

