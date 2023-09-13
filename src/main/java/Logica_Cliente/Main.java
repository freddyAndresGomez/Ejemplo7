/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Empleado;
import java.util.Scanner;

/**
 *
 * @author 1059236799
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarando variables
        String nombre="";
        int año_ingreso=0;
        String codigo="";
        int año_actual=2023;
        int total=0;
        
        //creando objetos
        Empleado objempleado = new Empleado();
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Digite el nombre");
        nombre=scan.nextLine();
        objempleado.setNombre(nombre);
        
        System.out.println("Digite el codigo del empleado");
        codigo=scan.nextLine();
        objempleado.setCodigo(codigo);
        
        System.out.println("Digite el año de ingreso del empleado");
        año_ingreso=scan.nextInt();
        objempleado.setAño_ingreso(año_ingreso);
        
        total=año_actual-objempleado.getAño_ingreso();
        
        System.out.println("El nombre del empleado es:"+"\t"+objempleado.getNombre());
        System.out.println("El codigo del empleado es:"+"\t"+objempleado.getCodigo());
        System.out.println("Años en la institucion:"+"\t"+total);
        
       
                
        
                
             
        
    }
    
}
