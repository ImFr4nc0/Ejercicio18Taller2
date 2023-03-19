/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18taller2;
import java.util.Scanner;

public class Ejercicio18Taller2 {

    public static void main(String[] args) {
        Scanner Codigo = new Scanner(System.in);
        System.out.println("Ingrese el Código del empleado: ");
        int COD=Codigo.nextInt();
        Scanner NombreEm = new Scanner (System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String NE= NombreEm.next();
        Scanner Numhora = new Scanner (System.in);
        System.out.println ("Ingrese numero de horas trabajadas: ");
        int Nh= Numhora.nextInt();
        Scanner ValHor = new Scanner(System.in);
        System.out.println ("Ingreseel valor de las horas: ");
        int VH = ValHor.nextInt();
        Scanner Reten = new Scanner (System.in);
        System.out.println ("Ingrese porcentaje de retención en la fuerte: ");
        float RF= Reten.nextFloat();
        int SalBru = Nh * VH;
        float SalNet = (SalBru - RF);
        System.out.println("El código del empleado es: "+COD+"con nombres "+NE+" con un salario bruto de "+SalBru+" con un salario neto de "+SalNet);
    }
    
}
