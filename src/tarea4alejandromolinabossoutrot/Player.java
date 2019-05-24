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
    
    private String nombre;
    private int vidas;
    
     public Player() {
        this.nombre = "sin_nombre";
        this.vidas = 10;
     
    }

	public Player(String nombre,int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
        
    
    
}
