/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3arrays;

import utilidades.Utilidad;

/**
 *
 * @author ADMINMJ
 */
public class Ej3Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Concesionario miEmpresa;
        int nempleados;
        nempleados=Utilidad.pedirNumeroEntero("numero de empleados", 1, 200);
        miEmpresa=new Concesionario(nempleados);
        miEmpresa.pedirNombres();
        miEmpresa.pedirVentas();
        miEmpresa.informe();
        System.out.println("El empleado con mayor comision"+
                miEmpresa.mayorComision());
        System.out.println("El empleado con menor comision"+
                miEmpresa.menorComision());
    }
    
}
