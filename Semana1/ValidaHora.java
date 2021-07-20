/*Programa que lea por teclado tres números enteros H, M, S
correspondientes a hora, minutos y segundos respectivamente, y
comprueba si la hora que indican es una hora válida*/
import java.util.Scanner;
public class ValidaHora {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        int hor, min, seg;
        System.out.println("Por favor Ingrese la hora:");
        hor = sc.nextInt();
        System.out.println("Por favor Ingrese los minutos:");
        min = sc.nextInt();
        System.out.println("Por favor Ingrese los segundos:");
        seg = sc.nextInt();
        Boolean veriHora;
        Boolean veriMinutos;
        Boolean verisegund;

        veriHora = hor >= 0 && hor <= 23 ? true: false;
        veriMinutos = min >= 0 && min <= 59 ? true : false;
        verisegund = seg >= 0 && seg <=  59? true : false;

        if (veriHora == false | veriMinutos == false | verisegund == false){
            System.out.println("La hora ingresada no es válida");
        }
        else {
            System.out.println("La hora ingresada es válida");
        }
        sc.close();
    }
}
