/*Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por
teclado.*/
import java.util.Scanner;
public class Km_a_Mts {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.println("Por favor, Ingrese la velocidad en Km/h:");
        float Vel = sc.nextInt();
        float Resultado = Vel * 1000 / 3600;
        System.out.println("La velocidad en m/s es: " + Resultado);
        sc.close();
    }
    
}
