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
public class TestAgregar {

    public TestAgregar() {
    }
 
    
     @Test
    public void testAgregar(){
       System.out.println("Agregar");
       Venta ventas = new Venta("001", 2000, 4);
       ColeccionVentas instance = new ColeccionVentas();
       boolean esperando = true;
       boolean obtenido=instance.Agregar(ventas);
       Assert.assertEquals(esperando, obtenido);
    }
}
