/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ale_d
 */
public class TestListar {
      public TestListar() {
    }
    
      @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperando = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = instance.Listar();
        Assert.assertEquals(esperando, obtenido);
    }
}
