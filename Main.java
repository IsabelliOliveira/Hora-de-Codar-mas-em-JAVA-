import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String planeta = "Plutão";
        System.out.println(planeta);
    
        //exercicio 2

        System.out.println("Qual o seu nome");
        Scanner pergunta2 = new Scanner(System.in);
        String nome = pergunta2.nextLine();

        System.out.println("Olá!" + nome);

        //exercicio 3

        System.out.println("Qual o seu nome");
        Scanner pergunta3 = new Scanner(System.in);
        String nome2 = pergunta3.nextLine();

        System.out.println("Qual o sua idade");
        int idade = pergunta3.nextInt();

        System.out.println("Olá " + nome2 + ", sua idade é " + idade);

        //exercicio 4
            //exercicio Retangulo

        System.out.println("Qual o valor da base do retangulo");
        Scanner pergunta4 = new Scanner(System.in);
        int base = pergunta3.nextInt();

        System.out.println("Qual o valor da altura do retangulo");
        int altura  = pergunta3.nextInt();

        System.out.println("O valor da area do retangulo é " + base * altura);

        //exercicio Quadrado
        System.out.println("Qual o valor do lado");
        int lado = pergunta3.nextInt();

        System.out.println("O valor da area do Quadrado é " + lado * lado );

        //exercicio Trapézio
        System.out.println("Informe o valor da base maior");
        int base_maior = pergunta4.nextInt();

        System.out.println("Informe o valor da base menor");
        int base_menor = pergunta4.nextInt();

        System.out.println("Informe o valor da altura");
        int altura_h = pergunta4.nextInt();

        System.out.println("O valor da area do Trapézioo é " + ((base_maior * base_menor)* altura_h)/2);

        //exercicio 5

        System.out.println("Escreva um valor");
        Scanner pergunta5 = new Scanner(System.in);
        int numero_usuario = pergunta5.nextInt();

        if(numero_usuario < 0){
            System.out.println("Valor é Negativo");
        }else if(numero_usuario >0){
            System.out.println("Valor é Positivo");
        }else{
            System.out.println("Zero");
        }

        
    }
}
