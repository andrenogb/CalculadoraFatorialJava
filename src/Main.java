import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        long numeroACalcular;
        int continuar;

        do{
            System.out.println("--------Bem vindo a calculadora de fatorial--------\n");
            System.out.println("Digite o numero que voce queira calcular!");
            numeroACalcular = leitor.nextLong();
            System.out.println("O Fatorial de: !" + numeroACalcular);
            long resultadoAcumulado = numeroACalcular;

            for (long n = numeroACalcular - 1; n > 0; n--) {

                resultadoAcumulado = resultadoAcumulado * n;
                System.out.println(numeroACalcular + "X" + n + "=" + resultadoAcumulado);


            }
            System.out.println("Resultado final: " + resultadoAcumulado);
            System.out.println("Deseja Calcular outro numero?");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            continuar = leitor.nextInt();

            if (continuar == 2){
                System.out.println("Fechando programa... Obrigado!!!");
            }


        }while(continuar == 1);

        leitor.close();
    }
}
