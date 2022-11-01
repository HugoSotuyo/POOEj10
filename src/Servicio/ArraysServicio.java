/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import java.util.Arrays;

/**
 *
 * @author hdsot
 */
public class ArraysServicio {
    public double[] crearArray(int largo) {
        double num;
        double[] array = new double[largo];
        for (int i = 0; i < largo; i++) {
            num = random() * 100;
            array[i] = floor(num);
        }
        return array;
    }
    public double[] ordenarArreglo(double[]vectorA){
        double[]ordenado=new double[50];
        Arrays.sort(vectorA);
        System.arraycopy(vectorA, 0, ordenado, 0, 50);
        return ordenado;
    }
    public double[] crearArrayB(double[]vectorordenado){
        double[]vectorB=new double[20];
        System.arraycopy(vectorordenado, 0, vectorB, 0, 10);
        for (int i = 10; i < 20; i++) {
            vectorB[i]=0.5;
        }
        return vectorB;
    }
    public void mostrarVectorAordenado(double[]vectorAorden){
        for (int i = 0; i < 50; i++) {
            System.out.print("["+vectorAorden[i]+"]");
        }
    }
    public void mostrarVectorB(double[]vectorB){
        for (int i = 0; i < 10; i++) {
            System.out.print("["+vectorB[i]+"]");
        }
        for (int i = 10; i < 20; i++) {
            System.out.print("["+0.5+"]");
        }
    }
}
