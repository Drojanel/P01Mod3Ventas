/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ale_d
 */
public class TestSubTotal {
    
     public TestSubTotal() {
    }
 
    
     @Test
    public void TestSubTotal(){
       System.out.println("SubTotal");
        String codigo = "001";
        Venta ventas = new Venta("001", 2000, 4);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(ventas);
        int esperando = 8000;
        int obtenido = instance.subTotal(codigo);
        Assert.assertEquals(esperando, obtenido);
    }
    
}
