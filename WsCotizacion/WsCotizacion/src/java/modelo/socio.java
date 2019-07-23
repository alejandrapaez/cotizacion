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
public class socio {
    
    int id;
    String nombre;
    Double tasa;
    Double montomaximo;

    public socio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

    public Double getMontomaximo() {
        return montomaximo;
    }

    public void setMontomaximo(Double montomaximo) {
        this.montomaximo = montomaximo;
    }
    
    
}
