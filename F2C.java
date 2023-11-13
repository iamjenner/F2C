/* Ijenna Okonkwo
 * iso2108
 * F2C.java - prompts for a temperature in Fahrenheit and outputs a temperature in Celsius
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        
        System.out.print("What Fahrenheit temperature would you like to convert? ");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int cel = ((x-32)*5)/9;
        System.out.println(cel);
        
    }
    
    
}
