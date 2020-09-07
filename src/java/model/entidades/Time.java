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
public class Time {

    private int id_time = 0;
    private String descricao = "";
    private int pontos = 0;
    private int jogos = 0;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;
    private int golpro;
    private int golcontra = 0;
    private int saldodegols = 0;

    
    //Contrutor Vazio
    public Time() {

    }

    public int getId_time() {
        return id_time;
    }

    public void setId_time(int id_time) {
        this.id_time = id_time;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolpro() {
        return golpro;
    }

    public void setGolpro(int golpro) {
        this.golpro = golpro;
    }

    public int getGolcontra() {
        return golcontra;
    }

    public void setGolcontra(int golcontra) {
        this.golcontra = golcontra;
    }

    public int getSaldodegols() {
        return saldodegols;
    }

    public void setSaldodegols(int saldodegols) {
        this.saldodegols = saldodegols;
    }

}
