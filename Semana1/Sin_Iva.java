/*Programa que calcule el precio de venta de un producto conociendo el precio
por unidad (sin IVA) del producto, el número de productos vendidos y el
porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.*/
import java.util.Scanner;
public class Sin_Iva {
    public static void main(String[] args){
        final double iva = 0.19;
        var sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Por favor, Ingrese el nombre del producto: ");
        var Nom_producto = sc.nextLine();
        System.out.println("Por favor, Ingrese el precio por unidad (sin iva) del producto:");
        var Prec_unit_SinIva = sc.nextDouble();
        System.out.println("Por favor, Ingrese la cantidad de productos vendidos:");
        var Cant_Vend = sc.nextDouble();
        System.out.println("-------------------------------");

        System.out.println("El IVA es del 19% (Si o No");
        var op = sc.next();

        if (op.toUpperCase().equals("No")){
            System.out.println("Por favor, Ingrese el Iva correspondientes: Nota = El digito debe ser ingresado como decimal");
            var Iva_Corresp = sc.nextDouble();
            double resultado = ((Cant_Vend * Prec_unit_SinIva) + ((Cant_Vend * Prec_unit_SinIva)*Iva_Corresp));
            System.out.println("EL precio de venta del "+Nom_producto+ "es: $" + resultado);
        }else{
        final double resultado = ((Cant_Vend) * Prec_unit_SinIva) + ((Cant_Vend * Prec_unit_SinIva)*iva);
        System.out.println("El precio de venta por unidad de "+Nom_producto+ "es: $" + resultado/Cant_Vend);
        System.out.println("El precio de venta total de "+Nom_producto+ "es: $" + resultado);

        }
        sc.close();
    }
}
    

