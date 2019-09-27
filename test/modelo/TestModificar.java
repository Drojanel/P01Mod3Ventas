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
public class TestModificar {
      public TestModificar() {
    }
    
    @Test
    public void TestModificar(){
       System.out.println("Modificar");
       Venta ventas = new Venta("001", 2000, 4);
       ColeccionVentas instance = new ColeccionVentas();
       instance.Agregar(ventas);
       boolean esperando = true;
       ventas = new Venta("001", 2500, 4);
       boolean obtenido=instance.modificar(ventas);
       Assert.assertEquals(esperando, obtenido);
    }
}
      