import java.util.Scanner;

//fiz antes de ver que tinha que usar o código do GitHub

public class ContadorAlternativo {
    public static void main(String[] args) {

        int primeiroNum;
        int segundoNum;

        while(true) {
            Scanner scany = new Scanner(System.in);
            System.out.println("Por favor, insira o PRIMEIRO número: ");
            primeiroNum = scany.nextInt();
            System.out.println("Agora insira o SEGUNDO número: ");
            segundoNum = scany.nextInt();

            try {
                if (primeiroNum <= segundoNum) {
                    contar(primeiroNum, segundoNum);
                    break;
                } else {
                    throw new ParametrosInvalidosException();
                }
            } catch (ParametrosInvalidosException ex) {
                System.out.println("Entradas INVÁLIDAS, lembre que o SEGUNDO número deve ser maior que o PRIMEIRO. Por favor tente novamente. ");
            }
        }
    }
    public static void contar(int numUm, int numDois){
        int contagem = numDois - numUm;
        System.out.println("Iniciando contagem de " + contagem + " números.");
        for(int i = 0; contagem > i; i++){
            System.out.println("Printando número " + (i + 1));
        }
    }
}