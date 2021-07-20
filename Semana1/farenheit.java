import java.util.Scanner;
public class farenheit {
    public static void main(String [] args){
    
        Scanner sc = new Scanner(System.in);
        int temperatura;
        System.out.println("por favor ingrese una temperatura en °C");
        temperatura = sc.nextInt();
        int Faren = 32 + (9 * temperatura / 5);
        System.out.println("La temperatura es " + Faren + " °F");
        sc.close();
    }
}    

