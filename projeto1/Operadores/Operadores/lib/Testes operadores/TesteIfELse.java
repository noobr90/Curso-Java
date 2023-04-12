import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) throws Exception {

       
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 2 numeros");
        
        int primeiroNumero = sc.nextInt();
        int segundoNumero = sc.nextInt();
        int resultadoSoma = primeiroNumero + segundoNumero;
        String verdadeiroFalso;

        System.out.println("Resultado da soma: "+resultadoSoma);

        if(resultadoSoma<10){
            System.out.println("É menor que 10");

        } else if (resultadoSoma == 10){
            System.out.println("É igual a 10");

        } else if(resultadoSoma>10){

            System.out.println("É maior que 10");

        }else{

            System.out.println("Tem algo errado ai em");
        }


    }
}
