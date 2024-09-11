import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CaixaEletronico caixaEletronico = new CaixaEletronico(100, input);
        int opcao;

//        double resultado = caixaEletronico.calculaDobro(100);

//        System.out.println("O resultado foi: "  + resultado);
        while (true) {
            System.out.println("19 - Questao 19\n" +
                    "15 - Questao 15\n" +
                    "0 - Sair\n");
            System.out.print("Sua escolha:> ");
            opcao = input.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("SAINDO... \nATE A PROXIMA\n");
                    return;
                case 19:
                    caixaEletronico.exibirMenu();
                    break;
                case 15:
                    Ponto p1;
                    Ponto p2;
                    double x;
                    double y;

                    System.out.println("INFORME A COORDENADA X DO PONTO 1");
                    x = input.nextDouble();
                    System.out.println("INFORME A COORDENADA Y DO PONTO 1");
                    y = input.nextDouble();

                    p1 = new Ponto(x, y);

                    System.out.println("INFORME A COORDENADA X DO PONTO 2");
                    x = input.nextDouble();
                    System.out.println("INFORME A COORDENADA Y DO PONTO 2");
                    y = input.nextDouble();

                    p2 = new Ponto(x, y);

                    System.out.println();

                    System.out.println("A DISTANCIA DO " + p1 +
                            " PARA O " + p2 + " EH: "
                            + p1.calcularDistanciaParaPonto2(p2));


                    break;
                default:
                    break;
            }
        }


    }
}