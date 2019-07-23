/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aapaez
 */
public class credito {
    
    String nombre;
    Double Valorcouta;
    Double creditototal;
    String tasa;

    public credito() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorcouta() {
        return Valorcouta;
    }

    public void setValorcouta(Double Valorcouta) {
        this.Valorcouta = Valorcouta;
    }

    public Double getCreditototal() {
        return creditototal;
    }

    public void setCreditototal(Double creditototal) {
        this.creditototal = creditototal;
    }

    public String getTasa() {
        return tasa;
    }

    public void setTasa(String tasa) {
        this.tasa = tasa;
    }
    
}
