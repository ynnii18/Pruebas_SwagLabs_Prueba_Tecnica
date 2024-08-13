package com.testing.moviles.app.models;

public class InfoCompra {

    private String nombreArticulo;
    private String nombreCheck;
    private String apellidoCheck;
    private String codPostalCheck;

    public String getNombreCheck() {return nombreCheck;}

    public void setNombreCheck(String nombreCheck) {this.nombreCheck = nombreCheck;}

    public String getApellidoCheck() { return apellidoCheck; }

    public void setApellidoCheck(String apellidoCheck) { this.apellidoCheck = apellidoCheck; }

    public String getCodPostalCheck() { return codPostalCheck; }

    public void setCodPostalCheck(String codPostalCheck) { this.codPostalCheck = codPostalCheck; }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
}
