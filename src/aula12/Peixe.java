/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Suporte
 */
public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nandando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirsom() {
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
