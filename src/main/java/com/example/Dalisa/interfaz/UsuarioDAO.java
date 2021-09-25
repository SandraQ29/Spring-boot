package com.example.Dalisa.interfaz;

public interface UsuarioDAO {
    

    public String validarAcceso(String use , String pass);

    public void sendEmail(String form,String body);
}
