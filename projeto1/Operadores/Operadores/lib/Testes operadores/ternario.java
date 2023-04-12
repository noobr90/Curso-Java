import java.util.Scanner;

public class ternario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main (String[] args)throws Exception{
        int a;
        int b;
        String testador;
        boolean verificador;

        Scanner sc=new Scanner(System.in);

        System.out.println("Digite numero 1 e 1");
        a=sc.nextInt();
        b=sc.nextInt();
        testador = a==b ? "verdadeiro":"falso";

        if (testador == "verdadeiro"){
            
            System.out.println(verificador=true);
        }else{
            System.out.println(verificador=false);
        }








    }
}
