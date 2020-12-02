/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3arrays;

/**
 *
 * @author ADMINMJ
 */
public class Empleado {
    private String nombre;
    private float importeVentas;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getImporteVentas() {
        return importeVentas;
    }

    public void setImporteVentas(float importeVentas) {
        this.importeVentas = importeVentas;
    }

   
    
    
}
