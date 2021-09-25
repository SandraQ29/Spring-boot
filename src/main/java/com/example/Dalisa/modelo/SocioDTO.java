package com.example.Dalisa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBLSOCIO")
public class SocioDTO {
   
    @Id
    @Column(name = "[ID SOCIO]",length =10)
    private String idSocio;
    @Column(name = "[PUNTO BONO]")
    private double puntoBono;
    @Column(name = "[RANGO]",length =40)
    private String rango;
    @ManyToOne
    @Column(name = "[ID USUARIO]",length =10)
    private UsuarioDTO idUsuario;
    @Column(name = "[ID SOCIO]",length =25)
    private String paqueteInscripto;

    
    public String getIdSocio() {
        return idSocio;
    }
    public void setIdSocio(String idSocio) {
        this.idSocio = idSocio;
    }
    public double getPuntoBono() {
        return puntoBono;
    }
    public void setPuntoBono(double puntoBono) {
        this.puntoBono = puntoBono;
    }
    public String getRango() {
        return rango;
    }
    public void setRango(String rango) {
        this.rango = rango;
    }
    public UsuarioDTO getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(UsuarioDTO idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getPaqueteInscripto() {
        return paqueteInscripto;
    }
    public void setPaqueteInscripto(String paqueteInscripto) {
        this.paqueteInscripto = paqueteInscripto;
    }



}
