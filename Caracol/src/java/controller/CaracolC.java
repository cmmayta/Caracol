package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "caracolControl")
@SessionScoped
public class CaracolC implements Serializable {

    private int altura;
    private int sube;
    private int baja;
    private String rpta="";
    int avance=0,days=0;
           
    public void calcular(){
        while(avance<altura){
            avance+=sube;
            days++;
            if(avance >= altura){
                break;
            }
            avance-=baja;
        }
        rpta = "Tardará " + days + " dias en llegar a la meta";
    }
      
    
    
    
    
    
    
    
    
    
    
    
    
    public CaracolC() {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSube() {
        return sube;
    }

    public void setSube(int sube) {
        this.sube = sube;
    }

    public int getBaja() {
        return baja;
    }

    public void setBaja(int baja) {
        this.baja = baja;
    }

    public String getRpta() {
        return rpta;
    }

    public void setRpta(String rpta) {
        this.rpta = rpta;
    }
    
}