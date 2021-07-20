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

/*  public static void main(String [] args){
        
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("Ingrese un número entero");
        num = sc.nextInt();
        String par;
        int resto = num%2;
        par = resto == 0  ? "Par" : "Impar";
        System.out.println(par);
    }

 */
