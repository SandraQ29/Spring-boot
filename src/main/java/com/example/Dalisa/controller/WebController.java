package com.example.Dalisa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(path = "/web")
public class WebController{

    
@GetMapping("/")
public String Web_Index() throws Exception{
    return "Index";
}
@GetMapping("/Dalisa")
public String Web_Login() throws Exception{
    return "Login";
}
@GetMapping("/RecuperarCuenta")
public String Web_EnviarCorreo() throws Exception{
    return "RecuperarCuenta";
}

@GetMapping("/Dashboard")
public String Web_Dashboard() throws Exception{
    return "Dashboard";
}
@GetMapping("/Producto")
public String web_Producto() throws Exception{
    return "TiendaProducto";
}
@GetMapping("/Admin")
public String web_Admin() throws Exception{
    return "Admin";
}
}