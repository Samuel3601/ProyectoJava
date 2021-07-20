 //* Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras. Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.
import java.util.Scanner;
public class eliminarDigitos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, m;
        System.out.println("Ingrese el número");
        N = sc.nextInt();
        System.out.println("Ingrese la cantidad de cifras finales a eliminar");
        m = sc.nextInt();

        while (m != 0){
            N = N / 10;
            m -= 1;
        }
        System.out.println("El número resultante es " + N); 
        sc.close(); 
    }   
}

