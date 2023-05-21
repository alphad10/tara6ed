
package org.example;


public class Tarea6EDClase {
    private static final double DESC2 = 0.95;
    private static final double DESC1 = 0.8;
    
    
     public void aplicarDescuento(double precioProducto, int numProductos){     
         double Total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            Total = precioProducto*DESC1;
            mostrarPrecio(Total);
        }else {
            Total = precioProducto*DESC2;
            mostrarPrecio(Total);
        }   

    }

    private void mostrarPrecio(double Total) {
        System.out.println("El total a pagar es:"+Total);
        System.out.println("Enviado");
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
