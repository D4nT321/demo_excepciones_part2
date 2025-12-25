package com.demo_ejmplo_2;
public class Producto {

    private String nombre;
    private int cantidadDisponible;

    public Producto(String nombre, int cantidadDisponible) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void reducirCantidad(int cantidad) {
        if (this.cantidadDisponible < cantidad) {
            throw new StockInsufucienteExcepcion("Stock insuficiente para el producto: " + nombre);
        }
        this.cantidadDisponible -= cantidad;
    }
    
}
