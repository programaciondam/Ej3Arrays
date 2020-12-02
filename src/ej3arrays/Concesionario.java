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
public class Concesionario {

    Empleado[] empleados;

    public Concesionario() {
        empleados = new Empleado[3];
        //crearEmpleados();
    }

    public Concesionario(int numeroEmpleados) {
        empleados = new Empleado[numeroEmpleados];
      //  crearEmpleados();
    }

    private void crearEmpleados() {
        for (int pos = 0; pos < empleados.length; pos++) {
            empleados[pos] = new Empleado();
        }
    }

    public void pedirNombres() {
        for (int pos = 0; pos < empleados.length; pos++) {
            String nombre;
            nombre = Utilidad.pedirString("Nombre del vendedor "+ pos+":");
            //empleados[pos].setNombre(nombre);
            empleados[pos]=new Empleado(nombre);
        }

    }
    public void informe()
    {
        System.out.println("Nombre  Importe Ventas");
        for (int pos=0; pos < empleados.length; pos++)
        {
            System.out.print(empleados[pos].getNombre());
            System.out.println("\t"+ empleados[pos].getImporteVentas());
            
        }
    }

}
