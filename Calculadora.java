package QuestEstudo;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ESCOLHER OPERAÇÃO
        int operacao;
        do {
            operacao = EscolheOperacao(sc);

            if (operacao == 1) {
                CodigoSoma(sc); //SOMA
            } else if (operacao == 2) {
                CodigoSubtracao(sc); //SUBTRAÇÃO
            } else if (operacao == 3) {
                CodigoMult(sc); //MULTIPLICAÇÃO
            } else if (operacao == 4) {
                CodigoDiv(sc); //DIVISÃO
            } else if (operacao == 5) {
                System.exit(1); //SAI DO CÓDIGO
            } else {
                Erro();
            }

        } while (operacao != 5);
    }

    private static void Erro() {
        System.out.println("Valor Inválido!");
        System.out.println("Digite um dos valores disponibilizados.");
        System.out.println();
    }

    private static void CodigoDiv(Scanner sc) {
        System.out.println("Vamos Dividir!");
        System.out.println("Digite o primeiro valor que você deseja realizar a opereação: ");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = sc.nextDouble();
        double resultado = primeiroValor / segundoValor;
        System.out.println("O resultado da operação é: " + resultado);
        System.out.println();
        System.out.println("Deseja continuar? Digite: ");
        System.out.println("1 para SIM");
        System.out.println("2 para NÃO");
        int operacao = sc.nextInt();
        System.out.println();
    }

    private static void CodigoMult(Scanner sc) {
        System.out.println("Vamos Multiplicar!");
        System.out.println("Digite o primeiro valor que você deseja realizar a opereação: ");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = sc.nextDouble();
        double resultado = primeiroValor * segundoValor;
        System.out.println("O resultado da operação é: " + resultado);
        System.out.println();
        System.out.println("Deseja continuar? Digite: ");
        System.out.println("1 para SIM");
        System.out.println("2 para NÃO");
        int operacao = sc.nextInt();
        System.out.println();
    }

    private static void CodigoSubtracao(Scanner sc) {
        System.out.println("Vamos Subtrair!");
        System.out.println("Digite o primeiro valor que você deseja realizar a opereação: ");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = sc.nextDouble();
        double resultado = primeiroValor - segundoValor;
        System.out.println("O resultado da operação é: " + resultado);
        System.out.println();
        System.out.println("Deseja continuar? Digite: ");
        System.out.println("1 para SIM");
        System.out.println("2 para NÃO");
        int operacao = sc.nextInt();
        System.out.println();
    }

    private static void CodigoSoma(Scanner sc) {
        int operacao;
        System.out.println("Vamos Somar!");
        System.out.println("Digite o primeiro valor que você deseja realizar a opereação: ");
        double primeiroValor = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double segundoValor = sc.nextDouble();
        double resultado = primeiroValor + segundoValor;
        System.out.println("O resultado da operação é: " + resultado);
        System.out.println();
        System.out.println("Deseja continuar? Digite: ");
        System.out.println("1 para SIM");
        System.out.println("2 para NÃO");
        operacao = sc.nextInt();
        System.out.println();
    }

    private static int EscolheOperacao(Scanner sc) {
        System.out.println("Digite o valor correspondente para a ação que você deseja: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
        System.out.print("Escolha: ");
        int operacao = sc.nextInt();
        System.out.println();
        return operacao;
    }
}
