/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectocontadorascendente;

/**
 *
 * @author Usuario
 */
public class ContadorAscendente {
  
    private int valorActual;

    public ContadorAscendente(int valorActual) {
        this.valorActual = valorActual;
    }

    public int getValorActual() {
        return valorActual;
    }

    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    public int incrementar(){
        if (this.valorActual<1000){
            this.valorActual++;
        }else{
            this.valorActual=1000;
        }
        return this.valorActual;
    }
    
    public void reiniciar(){
        this.valorActual=0;
    }
    
    @Override
    public String toString() {
        return "ContadorAscendente{" + "valorActual=" + valorActual + '}';
    }
  
}
