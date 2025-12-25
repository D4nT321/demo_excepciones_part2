package com.demo_ejmplo_2;
import java.util.HashMap;
import java.util.Map;

public class Inventario {

    private Map<String, Producto> productos = new HashMap<>();

    public void agregarProducto(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }

    public void procesarProducto(String nombre, int cantidad) throws ProductoNoEncontradoExcepcion {
        // Buscar el producto en el inventario
        // Si no se encuentra, lanzar ProductoNoEncontradoException
        Producto producto = productos.get(nombre);
        if (producto == null) {
            throw new ProductoNoEncontradoExcepcion("Producto no encontrado: " + nombre);
        }
        producto.reducirCantidad(cantidad); // Aqui se puede romper la logica, por tanto
        // es una excepcion no verificada
    }


}