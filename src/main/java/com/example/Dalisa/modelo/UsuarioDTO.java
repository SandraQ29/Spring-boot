package com.example.Dalisa.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
@Table(name="TBLUSUARIO")
public class UsuarioDTO {

    @Id
    @Column(name ="[ID USUARIO]",length =10)
    private String idUsuario;
    @Column(name ="[PAIS]",length =25)
    private String pais;
    @Column(name ="[NOMBRE USE]",length =35)
    private String nombree;
    @Column(name ="[APELLIDO USE]",length =35)
    private String apellido;
    @Column(name ="[FECHA NACI]")
    private String fechaNaci;
    @Column(name ="[ESTADO CIVIL]",length =40)
    private String estadoCivil;
    @Column(name ="[SEXO]",length =1)
    private String sexo;
    @Column(name ="[DNI USE]",length =8,unique = true)
    private String dni;
    @Column(name ="[DIRECCION]",length =105)
    private String direccion;
    @Column(name ="[CELULAR USE]",length =9)
    private String celular;
    @Column(name ="[CORREO USE]",length =25)
    private String correo;
    @Column(name ="[USE]",length =15)
    private String usuario;
    @Column(name ="[PASS]",length =15)
    private String password;
    @Column(name ="[CNT DEPOSITO]",length =20)
    private String cuentaDeposito;
    @ManyToOne
    @Column(name ="[ID BANCO]")
    private BancoDTO idBanco;
    @Column(name ="[FOTO USE]")
    private byte[] foto;
    @Column(name ="[FECHA REGISTRO]")
    private String fechaRegistro;
    @Column(name ="[ELIMINADO]",length =1)
    private String eliminado;


    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getNombree() {
        return nombree;
    }
    public void setNombree(String nombree) {
        this.nombree = nombree;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getFechaNaci() {
        return fechaNaci;
    }
    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCuentaDeposito() {
        return cuentaDeposito;
    }
    public void setCuentaDeposito(String cuentaDeposito) {
        this.cuentaDeposito = cuentaDeposito;
    }
    public BancoDTO getIdBanco() {
        return idBanco;
    }
    public void setIdBanco(BancoDTO idBanco) {
        this.idBanco = idBanco;
    }
    public byte[] getFoto() {
        return foto;
    }
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
   
    
}
