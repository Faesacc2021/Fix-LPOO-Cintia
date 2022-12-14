package view;

import util.ContaStrings;
import viewModel.OperacoesConta;

import java.util.Scanner;

public class Principal {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        movimentaConta();
    }
    private static void movimentaConta() {
        String entrada = "";
        int valorMenu = 0;

        while (valorMenu != 7) {

            System.out.println("\nEscolha uma opção");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Saldo");
            System.out.println("3 - Saque");
            System.out.println("4 - Depósito");
            System.out.println("5 - Transferência");
            System.out.println("6 - Lista Contas");
            System.out.println("7 - Sair");
            entrada = ler.nextLine();

            try {
                valorMenu = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
            	System.out.println(ContaStrings.NUMERO_VALIDO);
                continue;
            }

            switch (valorMenu) {
                case 1 :
                	OperacoesConta.cadastrar();
                	break;
                case 2 : 
                	OperacoesConta.consultarSaldo();
                	break;
                case 3 : 
                	OperacoesConta.realizarSaque();
                	break;
                case 4 : 
                	OperacoesConta.realizarDeposito();
                	break;
                case 5 : 
                	OperacoesConta.realizarTransferencia();
                	break;
                case 6 : 
                	OperacoesConta.imprimeContas();
                	break;
                case 7 : {
                    System.out.println(ContaStrings.PROGRAMA_ENCERRADO);
                    System.exit(0);
                }
                default : System.out.println(ContaStrings.OPCAO_INVALIDA);
            }
        }
    }
}

