import java.util.Scanner;
public class Numero_suerte {
    public static void main(String[] args){
        int dia, mes, año;
        var sc = new Scanner(System.in);
        System.out.println("Ingrese el dia de su nacimineto?");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes de su nacimineto?");
        mes = sc.nextInt();
        System.out.println("Ingrese el año de su nacimineto?");
        año = sc.nextInt();
        int Num_sur = dia + mes + año;
        int Sum_dig = 0;
        while (Num_sur != 0){
            Sum_dig = Sum_dig + (Num_sur%10);
            Num_sur = Num_sur/10;
        } 
        System.out.println("Su numero de la suerte es " +Sum_dig);
        sc.close();
    }

}



