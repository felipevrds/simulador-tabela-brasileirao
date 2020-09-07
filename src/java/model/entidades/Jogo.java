/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

/**
 *
 * @author Felipe
 */
public class Jogo{
    
    private int id_jogo = 0;
    private int id_rodada;
    private int id_timeA;
    private int id_timeB;
    private int goltimeA;
    private int goltimeB;
    
    
    public int getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(int id_jogo) {
        this.id_jogo = id_jogo;
    }

    public int getId_rodada() {
        return id_rodada;
    }

    public void setId_rodada(int id_rodada) {
        this.id_rodada = id_rodada;
    }

    public int getId_timeA() {
        return id_timeA;
    }

    public void setId_timeA(int id_timeA) {
        this.id_timeA = id_timeA;
    }

    public int getId_timeB() {
        return id_timeB;
    }

    public void setId_timeB(int id_timeB) {
        this.id_timeB = id_timeB;
    }

    public int getGoltimeA() {
        return goltimeA;
    }

    public void setGoltimeA(int goltimeA) {
        this.goltimeA = goltimeA;
    }

    public int getGoltimeB() {
        return goltimeB;
    }

    public void setGoltimeB(int goltimeB) {
        this.goltimeB = goltimeB;
    }     

    
    public Jogo() {
        
    }

}
