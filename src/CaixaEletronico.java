/*
Crie um programa para exibir o menu de um caixa eletrônico.
 Ele deve possuir as opções:
 Exibir saldo,
 Exibir extrato,
 Realizar depósito,
 Realizar saque,
 e Sair.
 Se alguma opção inválida for fornecida,
  exiba uma mensagem de erro e saia do programa.
   Observação: Utilize a estrutura de seleção \textit{Switch/Case}
    para implementar seu produto. Utilize números inteiros para
    indicar cada opção.
*/


import java.util.Scanner;

public class CaixaEletronico {
    // Private -> Modificador de acesso; Impede a manipulaçao
    //     Externa do atributo (leitura e escrita)
    // Package Friendly -> Visivel para todas as classes dentro do mesmo pacote
    // Public -> "Amigo de todos", completamente acessivel externamente.
    // Protected -> Visivel para classes "filhas"
    private double saldo;
    private Scanner input;

    // Construtor da clase
    // Obriga a inicializaçao de alguns atributos da classe
    public CaixaEletronico(double saldo, Scanner input) {
        this.saldo = saldo;
        this.input = input;
    }


    public void exibirMenu() {
        int opt; // Opçao escolhida pela pessoa utilizadora

        while (true) {
            System.out.println("\n\n.: Boas vindas ao Valadares Bank:.");
            System.out.println("Opçoes disponiveis:");
            System.out.println("\t1. Exibir saldo,\n" +
                    "\t2. Exibir extrato,\n" +
                    "\t3. Realizar depósito,\n" +
                    "\t4. Realizar saque,\n" +
                    "\t5. Sair.");
            System.out.print("Opçao desejada: ");
            opt = input.nextInt();

            switch (opt) {
                case 1: // Exibe saldo
                    System.out.printf("SALDO ATUAL: R$%.2f\n", this.saldo);
                    break;
                case 2: // Mostrar saldo
                    System.out.printf("EXTRATO ATUAL: $%.2f\n", this.saldo);
                    break;
                case 3: // REALIZAR DEPOSITO
                    System.out.print("INFORME O VALOR DO DEPOSITO: ");
                    double deposito;
                    deposito = input.nextDouble();
                    this.saldo += deposito; // <=>this.saldo = this.saldo + deposito;
                    System.out.println();
                    System.out.println("DEPOSITO REALIZADO COM SUCESSO!");
                    break;
                case 4: // SAQUE
                    double valorSaque;
                    System.out.print("QUANTO QUER SACAR?");
//                input.skip("\r\n");
                    valorSaque = input.nextDouble(); // LER VALOR SAQUE
                    System.out.println();
                    this.saldo -= valorSaque; // <=> this.saldo - this.saldo - valorSaque
                    System.out.println("SAQUE REALIZADO COM SUCESSO!");
                    break;
                case 5:
                    System.out.println("OBRIGADO POR VISITAR O VALADARES BANK");
                    System.out.println("ATE BREVE.");
                    System.out.println();
                    return;

                default:
                    System.out.println("OPCAO INVALIDA, TENTE NOVAMENTE");
                    System.out.println("SAINDO...");
                    return;
            }
        }

    }

    public double calculaDobro(double entrada) {
        double retorno;

        retorno = entrada * 2;

        return retorno;

        // return entrada * 2;
    }


}






