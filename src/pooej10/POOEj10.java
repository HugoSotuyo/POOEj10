/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

import Entidad.Array;
import Servicio.ArraysServicio;

/**
 *
 * @author hdsot
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] vector;
        Array arreglo = new Array();
        ArraysServicio array = new ArraysServicio();
        vector = array.crearArray(50);
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        array.ordenarArreglo(vector);
        System.out.println("");
        array.mostrarVectorAordenado(vector);
        System.out.println("");
        array.crearArrayB(vector);
        array.mostrarVectorB(vector);
    }
}
