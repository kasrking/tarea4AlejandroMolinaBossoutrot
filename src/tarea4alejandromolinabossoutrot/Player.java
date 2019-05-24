/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4alejandromolinabossoutrot;

/**
 *
 * @author kasrking
 */
public class Player {
    
    private char nombre;
    private int vidas;
    
     public Player() {
        this.nombre = 'Z';
        this.vidas = 10;
     
    }

	public Player(char nombre,int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
     
    }
    
}
