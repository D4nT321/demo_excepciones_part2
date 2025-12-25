package com.demo_ejmplo_2;

public class Main {
    public static void main(String[] args) {
       
        Inventario inventario = new Inventario();

        // Agregar productos al inventario
        inventario.agregarProducto(new Producto("Laptop", 10));
        inventario.agregarProducto(new Producto("Smartphone", 20));
        inventario.agregarProducto(new Producto("Tablet", 15));
        inventario.agregarProducto(new Producto("Monitor", 5));
        inventario.agregarProducto(new Producto("Teclado", 25));
        inventario.agregarProducto(new Producto("Mouse", 30));

        // Procesar productos

        // Casos de prueba al romper la logica
        try {
            inventario.procesarProducto("Laptop", 5); // Éxito
            inventario.procesarProducto("Smartphone", 2); // Lanza StockInsuficienteExcepcion
            inventario.procesarProducto("Cámara", 2); // Lanza ProductoNoEncontradoExcepcion    
            inventario.procesarProducto("Monitor", 3); // Éxito 
            inventario.procesarProducto("Teclado", 30); // Lanza StockInsuficienteExcepcion
            inventario.procesarProducto("Mouse", 10); // Éxito
            inventario.procesarProducto("Impresora", 1); // Lanza ProductoNoEncontradoExcepcion

        } catch (ProductoNoEncontradoExcepcion | StockInsufucienteExcepcion e) {
            System.out.println(e.getMessage());

        }
    }
}