
package com.demo_ejmplo_2;
public class ProductoNoEncontradoExcepcion extends Exception { 

    //Esto es una checked exception porque extiende de Exception
    public ProductoNoEncontradoExcepcion(String mensaje) {
        super(mensaje);
        
    }


}
