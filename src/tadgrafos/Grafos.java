/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadgrafos;

/**
 *
 * @author victor.rolival
 */
public class Grafos {
    private int vertices;
    private int [][] matrizadj;


    Grafos(int vertices){
        this.vertices = vertices;
        this.matrizadj = new int [vertices][vertices];
        for(int i = 0; i < matrizadj.length; i++)
            for(int j = 0; j < matrizadj[0].length; j++)
                matrizadj[i][j]=0;
    }       
    
    
    public void inseriraresta(int origem, int destino){
        matrizadj [origem][destino] = 1;
    }
    
    public void removeraresta(int origem, int destino){
        matrizadj [origem][destino] = 0;
    }
    public void esistearesta(int origem, int destino){
        if(matrizadj [origem][destino] == 1)
            System.out.println("Existe");
        else
            System.out.println("Não Existe");
    }
    public void listararestasadj (int vertice){
        for(int i = 0; i < matrizadj[vertice].length; i++){
            System.out.print(matrizadj[vertice][i]);
        }
            
                
    }
}