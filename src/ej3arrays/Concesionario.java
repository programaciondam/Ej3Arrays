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
    Comision[] comisiones;

    public Concesionario() {
        empleados = new Empleado[3];
        //crearEmpleados();
        comisiones = new Comision[]{
            new Comision(10000f, 0.05f),
            new Comision(15000f, 0.1f),
            new Comision(20000f, 0.15f),
            new Comision(25000f, 0.2f),
            new Comision(Float.MAX_VALUE, 0.25f)};

    }

    public Concesionario(int numeroEmpleados) {
        empleados = new Empleado[numeroEmpleados];
        //  crearEmpleados();
        comisiones = new Comision[5];
        comisiones[0] = new Comision(10000f, 0.05f);
        comisiones[1] = new Comision(15000f, 0.1f);
        comisiones[2] = new Comision(20000f, 0.15f);
        comisiones[3] = new Comision(25000f, 0.2f);
        comisiones[4] = new Comision(Float.MAX_VALUE, 0.25f);
    }

    private void crearEmpleados() {
        for (int pos = 0; pos < empleados.length; pos++) {
            empleados[pos] = new Empleado();
        }
    }

    public void pedirNombres() {
        for (int pos = 0; pos < empleados.length; pos++) {
            String nombre;
            nombre = Utilidad.pedirString("Nombre del vendedor " + pos + ":");
            //empleados[pos].setNombre(nombre);
            empleados[pos] = new Empleado(nombre);
        }

    }

    public void informe() {
        System.out.println("Nombre  Importe Ventas");
        float importeComision;
        for (int pos = 0; pos < empleados.length; pos++) {
            System.out.print(empleados[pos].getNombre());
            System.out.print("\t" + empleados[pos].getImporteVentas());
            
            importeComision=empleados[pos].getImporteVentas()
                    *busquedaComision(empleados[pos].getImporteVentas());
            System.out.println("\t"+importeComision);

        }
    }

    public void pedirVentas() {
        int codigoEmpleado;
        float ventas;
        codigoEmpleado = Utilidad.pedirNumeroEntero("Codigo del vendedor",
                -1, empleados.length - 1);
        while (codigoEmpleado != -1) {
            ventas = Utilidad.pedirNumero("Ventas del empleado "
                    + empleados[codigoEmpleado].getNombre());
            empleados[codigoEmpleado].actualizarVentas(ventas);
            codigoEmpleado = Utilidad.pedirNumeroEntero("Codigo del vendedor",
                    -1, empleados.length - 1);

        }

    }
    public float busquedaComision(float valor){
        boolean encontrado=false;
        int posicion=0;
        while (!encontrado && posicion < comisiones.length)
        {
            if ( valor < comisiones[posicion].getImporte())
                encontrado=true;
            else
                posicion++;
        }
        return comisiones[posicion].getPorcentaje();
    }
    public String mayorComision(){
        
        int mayor=0;
        for (int pos=1; pos < empleados.length; pos++ ){
            if ( empleados[pos].getImporteVentas()>
                    empleados[mayor].getImporteVentas())
                mayor=pos;
        }
        return empleados[mayor].getNombre();
    }
public String menorComision(){
        
        int menor=0;
        for (int pos=1; pos < empleados.length; pos++ ){
            if ( empleados[pos].getImporteVentas()<
                    empleados[menor].getImporteVentas())
                menor=pos;
        }
        return empleados[menor].getNombre();
    }
}
