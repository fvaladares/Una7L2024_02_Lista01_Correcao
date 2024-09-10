import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CaixaEletronico caixaEletronico = new CaixaEletronico(100, input);

//        double resultado = caixaEletronico.calculaDobro(100);

//        System.out.println("O resultado foi: "  + resultado);

        caixaEletronico.exibirMenu();

    }
}