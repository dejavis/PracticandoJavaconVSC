package com.pkgs;

import com.pkgs.model.Persona;
import com.pkgs.services.iPersonaService;
import com.pkgs.services.PersonaServiceimpl;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola a todos en Java");
        Persona p = new Persona(2,"Pablo");
        iPersonaService ip = new PersonaServiceimpl();
        ip.registrar(p);
    }
}