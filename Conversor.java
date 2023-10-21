package bytebank_herdado;
import java.util.Scanner;



public 
class Conversor {

      public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        double Real;

        double Dolar;

        double Euro;

        double Libra;



        while (true) {

            System.out.println("Seja bem vindo !");

            System.out.println("Seleciona a  opção que deseja realizar :");

            System.out.println("1. Converter real em (Dolar)");

            System.out.println("2 Converter Dolar em (Real)");

            System.out.println("3. Converter Real em (Euro )");

            System.out.println("4. Converter Euro em (Real ) ");

            System.out.println("5. Converter Real em (Libra) ");

            System.out.println("6.converter Libra  em (Real) ");

            System.out.println("7. Sair");

            int opcao
= scanner.nextInt();



            if (opcao 
== 7) {

                System.out.println("Saindo do programa!");

                System.out.println("Obrigado pela preferencia!");

                break;

            }



            switch (opcao) {

                case 
1:

                    System.out.print("Digite o valor em Real,para ser convertido em Dolar:");

                    Real = scanner.nextDouble();

                    Dolar = 
realParaDolar(Real);

                    System.out.println("O valor em Dolar é:"
+ Dolar 
+ " Dolares");

                    break;



                case 
2:

                    System.out.print("Digite o valor em Dolar,para ser convertido em Real:");

                    Dolar = scanner.nextDouble();

                    Real = 
dolarParaReal(Dolar);

                    System.out.println("valor em reais é "
+ Real 
+ " Reais");

                    break;

                case 
3:

                    System.out.print("Digite o valor em Real, para ser convertido em Euro: ");

                    Real = scanner.nextDouble();

                    Euro = 
realParaEuro(Real);

                    System.out.println("valor em Euro: "
+ Euro 
+ " Euros");

                    break;



                case 
4:

                    System.out.print("Digite o valor em Euro,para ser convertido em Real:");

                    Euro = scanner.nextDouble();

                    Real = 
euroParaReal(Euro);

                    System.out.println(" O valor em Real é : "
+ Real 
+ " Reais");

                    break;

                case 
5:

                    System.out.print("Digite o valor em Real,para ser convertido em Libra:");

                    Real = scanner.nextDouble();

                    Libra = 
realParaLibra(Real);

                    System.out.println("  valor em Real é : "
+ Libra 
+ " Libras ");

                    break;

                case 
6:

                    System.out.print("Digite o valor em Libra, para ser convertido em Real: ");

                    Libra = scanner.nextDouble();

                    Real = 
libraParaReal(Libra);

                    System.out.println("Valor em Real  é: "
+ Real 
+ " Reais");

                    break;

                default:

                    System.out.println("Opção inválida. Tente novamente.");

            }

        }

    }



    public 
static double
dolarParaReal(double
Real) {

        return (Real
* 
5);

    }



    public 
static double
realParaDolar(double
Dolar) {

        return (Dolar
* 
0.20);

    }



    public 
static double
realParaEuro(double
Real) {

        return (Real
* 
6);

    }



    public 
static double
euroParaReal(double
Euro) {

        return (Euro*0.19);

    }



    public 
static double
realParaLibra(double
Real) {

        return (Real*0.16);

    }



    public 
static double
libraParaReal(double
Libra) {

        return (Libra*6);

    }