package com.example.Dalisa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="TBLBANCO")
public class BancoDTO {
    

    @Id
    @Column(name="[ID BANCO]")
    private long idBanco;
    @Column(name="[NOMBRE BNC]",length=25)
    private String nombreBanco;
    @Column(name="[TIPO AHORRO]",length=30)
    private String tipoAhorro;
    @Column(name ="[ELIMINADO]",length =1)
    private String eliminado;
    

    public BancoDTO(long idBanco) {
        this.idBanco = idBanco;
    }

    
    public long getIdBanco() {
        return idBanco;
    }
    public void setIdBanco(long idBanco) {
        this.idBanco = idBanco;
    }
    public String getNombreBanco() {
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    public String getTipoAhorro() {
        return tipoAhorro;
    }
    public void setTipoAhorro(String tipoAhorro) {
        this.tipoAhorro = tipoAhorro;
    }  


}
