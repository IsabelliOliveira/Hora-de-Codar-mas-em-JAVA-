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

        pergunta2.close();

        //exercicio 3

        System.out.println("Qual o seu nome");
        Scanner pergunta3 = new Scanner(System.in);
        String nome2 = pergunta3.nextLine();

        System.out.println("Qual o sua idade");
        int idade = pergunta3.nextInt();

        System.out.println("Olá " + nome2 + ", sua idade é " + idade);

        pergunta3.close();

        //exercicio 4
            //exercicio Retangulo

        System.out.println("Qual o valor da base do retangulo");
        Scanner pergunta4 = new Scanner(System.in);
        int base = pergunta4.nextInt();

        System.out.println("Qual o valor da altura do retangulo");
        int altura  = pergunta4.nextInt();

        System.out.println("O valor da area do retangulo é " + base * altura);

        //exercicio Quadrado
        System.out.println("Qual o valor do lado");
        int lado = pergunta4.nextInt();

        System.out.println("O valor da area do Quadrado é " + lado * lado );

        //exercicio Trapézio
        System.out.println("Informe o valor da base maior");
        int base_maior = pergunta4.nextInt();

        System.out.println("Informe o valor da base menor");
        int base_menor = pergunta4.nextInt();

        System.out.println("Informe o valor da altura");
        int altura_h = pergunta4.nextInt();

        System.out.println("O valor da area do Trapézio é " + ((base_maior * base_menor)* altura_h)/2);

        pergunta4.close();

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

        pergunta5.close();

        //exercicio 6

        System.out.println("Informe um valor ");
        Scanner pergunta6 = new Scanner(System.in);
        int valor_1 = pergunta6.nextInt();

        System.out.println("Informe um 2° valor");
        int valor_2 = pergunta6.nextInt();

        System.out.println("Informe um 3° valor");
        int valor_3 = pergunta6.nextInt();

        if(valor_1 > valor_2 && valor_1 > valor_3 ){
            System.out.println("O maior valor é :" + valor_1 );
        } else if(valor_2 > valor_1 && valor_2 > valor_3 ){
            System.out.println("O maior valor é :" + valor_2);
        }else if(valor_3 > valor_1 && valor_3 > valor_2){
            System.out.println("O maior valor é :" + valor_3);
        }

        pergunta6.close();

        //exercicio 7

        System.out.println("Informe um valor");
        Scanner pergunta7 = new Scanner(System.in);
        int numero_1 = pergunta7.nextInt();

        System.out.println("Informe um 2° valor");
        int numero_2 = pergunta7.nextInt();

        System.out.println("Informe um 3° valor");
        int numero_3 = pergunta7.nextInt();

        if(numero_1 > numero_2 && numero_1 > numero_3 && numero_2 < numero_3){
            System.out.println("A soma dos 2 maiores numeros é" + numero_1 + numero_3);
        }
        else if(numero_2 > numero_1 && numero_2 > numero_3 && numero_1 < numero_3){
            System.out.println("A soma dos 2 maiores numeros é" + numero_2  + numero_3);
        }
        else if(numero_3 > numero_1 && numero_3 > numero_2 && numero_1 < numero_2){
            System.out.println("A soma dos 2 maiores numeros é" + numero_3 + numero_2);
        }
        else if(numero_3 > numero_2 && numero_3 > numero_1){
            System.out.println("A soma dos 2 maiores numeros é" + numero_3 + numero_1);
        }
        else if(numero_2 > numero_3 && numero_2 > numero_1 ){
            System.out.println("A soma dos 2 maiores numeros é" + numero_2 + numero_1);
        }
        else if(numero_1 > numero_3 && numero_1 > numero_2){
            System.out.println("A soma dos 2 maiores numeros é" + numero_1 + numero_2);
        }

        pergunta7.close();

        //exercicio 8

        System.out.println("Informe um valor");
        Scanner pergunta8 = new Scanner(System.in);
        int number_1 = pergunta8.nextInt();

        System.out.println("Informe um 2° valor");
        int number_2 = pergunta8.nextInt();

        while(number_2 <= 0){
            System.out.println("Valor é Negativo por favor informe um valor > 0");
        number_2 = pergunta8.nextInt();
        }

        int divisão= number_1 / number_2;
        System.out.println("O resultado da divisão do valor 1 pelo valor 2 é: " + divisão );

        pergunta8.close();
    }
    }
