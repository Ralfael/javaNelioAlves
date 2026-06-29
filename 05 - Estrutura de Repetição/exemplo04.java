import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

 // for    
    int soma = 0;
    for (int i=0; i<10; i++) {
    	int x = sc.nextInt();
    	i = soma + x;
    }
    
    System.out.println(soma);
    
    sc.close();
        }
}
