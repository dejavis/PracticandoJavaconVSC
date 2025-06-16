package com.pkgs.services;

import com.pkgs.model.Persona;

public class PersonaServiceimpl implements iPersonaService{

    @Override
    public void registrar(Persona persona) {
        System.out.print("");
        System.out.println(persona+" registrada");
        //throw new UnsupportedOperationException("Unimplemented method 'registrar'");
    }

}
