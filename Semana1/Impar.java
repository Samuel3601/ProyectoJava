import java.util.Scanner;
public class Impar {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.println("Ingrese un numero Entero?");
        var num = sc.nextInt();

        var respuesta = validarNum(num);

        System.out.println("El numero " + respuesta);
        sc.close();
    }
    public static String validarNum(int num){
        return (num%2 == 0 ? num + " es par" : num + " es impar");
    }
}
