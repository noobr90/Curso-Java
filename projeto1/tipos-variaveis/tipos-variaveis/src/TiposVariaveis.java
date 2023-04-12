import java.util.Scanner;


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome;
        int minhaIdade;
        float peso;
        String minhaIdadeConvertida;

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite seu nome");
            meuNome=sc.nextLine();
        System.out.println("Digite sua idade");
            minhaIdade=sc.nextInt();
        System.out.println("Digite seu peso");
            peso=sc.nextFloat();

        System.out.println(meuNome);           
        System.out.println(minhaIdade);
        System.out.println(peso);


    }
}
