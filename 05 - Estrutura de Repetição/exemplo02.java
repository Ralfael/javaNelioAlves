import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //TESTE DE MESA - MANUAL
    
    int x = 0;
    int y = 4;
    
    
    while (x < 3) {
    
    	y = y + 2;
    	x = x + 1;
    	
    }
    
    System.out.println(x + "-" + y);
    
    sc.close();
        }
}