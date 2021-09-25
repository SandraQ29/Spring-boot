package com.example.Dalisa.controller;


import com.example.Dalisa.modelo.UsuarioDTO;
import com.example.Dalisa.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/Login")
public class LoginController {


  @Autowired
  private LoginService serviceLogin;

  @GetMapping("/")
  public String LoginUsuario(Model model) throws Exception {
    model.addAttribute("UsuarioForm", new UsuarioDTO());

    return "Login";
  }

  // https://dniruc.apisperu.com/api/v1/dni/73030922
  @PostMapping("/Use")
  @ResponseBody
  public String ValidarUsuario(@RequestParam String usuario, @RequestParam String password) throws Exception {
    return serviceLogin.validarAcceso(usuario, password);
  }

  @PostMapping("/Correo")
  @ResponseBody
  public String EnviarCorreo(@RequestParam String correo) throws Exception {
    UsuarioDTO use = new UsuarioDTO();
    String messaje = "Usuario:" + use.getUsuario() + " \n\n PASSWORD:" + use.getPassword();
    serviceLogin.sendEmail(correo, messaje);
    return "Envio Correctamente";
  }

}
