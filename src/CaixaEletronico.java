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



public class CaixaEletronico {
    // Private -> Modificador de acesso; Impede a manipulaçao
    //     Externa do atributo (leitura e escrita)
    // Package Friendly -> Visivel para todas as classes dentro do mesmo pacote
   // Public -> "Amigo de todos", completamente acessivel externamente.
   // Protected -> Visivel para classes "filhas"
    private double saldo;

    // Construtor da clase
    // Obriga a inicializaçao de alguns atributos da classe
    public CaixaEletronico(double saldo) {
        this.saldo = saldo;
    }


    public void exibirMenu() {

    }

    public double calculaDobro(double entrada) {
        double retorno;

        retorno =  entrada * 2;

        return retorno;

       // return entrada * 2;
    }



}






