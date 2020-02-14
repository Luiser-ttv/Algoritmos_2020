/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenados2020;

/**
 *
 * @author luiserttv
 */
public class AlgoritmosOrdenados2020 {

    public void ordenacionBurbujas(int [] numeros){
        for()
         for (int i=0; i<numeros.length; i++){
             if(numeros[i] > numeros[i + 1]){
                 int aux = numeros[i+1];
                 numeros[i+1] = numeros[i];
                 numeros[i] = aux;
             }
         }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
