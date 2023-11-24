import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner options = new Scanner(System.in);
        int operacoes;
        Float valor;
        ContaBancaria conta = new ContaBancaria("Pedro Henrique Peres", "Corrente", 1000000f);
        Locale localBrasil = new Locale("pt", "BR");
        NumberFormat formatoBrasil = NumberFormat.getCurrencyInstance(localBrasil);
        String valorFormatadoBrasil = formatoBrasil.format(conta.getSaldo());
        System.out.println("***********************************\n");
        System.out.println("Nome: " + conta.getTitular());
        System.out.println("Tipo de conta:  " + conta.getTipoDeConta() );
        System.out.println("Saldo inicial " + valorFormatadoBrasil);
        System.out.println("***********************************\n\n\n");

        while (conta.acesso = true) {

            System.out.println("Operações\n\n");
            System.out.println("""
                1-Consultar saldo
                2-Receber valor
                3-Transferir valor
                4-Sair
                """);
            System.out.print("Digite a opção desejada: ");
            operacoes = options.nextInt();
            if (operacoes == 1) {
                System.out.println(valorFormatadoBrasil);
            } else if (operacoes == 2) {
                System.out.print("Informe o valor que irá receber:");
                valor = options.nextFloat();
                conta.setSaldo(conta.saldo + valor);
                valorFormatadoBrasil = formatoBrasil.format(conta.getSaldo());
                System.out.println("Saldo atualizado " + valorFormatadoBrasil);

            } else if (operacoes == 3) {
                System.out.print("Informe o valor que irá transferir:");
                valor = options.nextFloat();
                if (valor > conta.getSaldo()) {
                    System.out.println("Saldo insuficiente, operação não realizada.");
                } else {
                    conta.setSaldo(conta.getSaldo() - valor);
                    valorFormatadoBrasil = formatoBrasil.format(conta.getSaldo());
                    System.out.println("Saldo atualizado " + valorFormatadoBrasil);
                }

            } else if (operacoes == 4) {
                conta.setAcesso(false);

                break;

            } else {
                System.out.println("Opção inválida, somente de 1 a 4");
            }

        }
        System.out.println("Obrigado! Volte sempre!");








    }
}