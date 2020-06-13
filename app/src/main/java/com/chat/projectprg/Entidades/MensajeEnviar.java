package com.chat.projectprg.Entidades;

import com.chat.projectprg.Entidades.Mensaje;

import java.util.Map;

public class MensajeEnviar extends Mensaje {
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======

>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    private Map hora;

    public MensajeEnviar() {
    }

    public MensajeEnviar(Map hora) {
        this.hora = hora;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public MensajeEnviar(String mensaje, String nombre, String fotoPerfil, String type_mensaje, Map hora) {
        super(mensaje, nombre, fotoPerfil, type_mensaje);
        this.hora = hora;
    }

    public MensajeEnviar(String mensaje, String urlFoto, String nombre, String fotoPerfil, String type_mensaje, Map hora) {
        super(mensaje, urlFoto, nombre, fotoPerfil, type_mensaje);
=======
    public MensajeEnviar(String mensaje, String nombre, String type_mensaje, Map hora) {
        super(mensaje, nombre, type_mensaje);
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
    public MensajeEnviar(String mensaje, String nombre, String type_mensaje, Map hora) {
        super(mensaje, nombre, type_mensaje);
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        this.hora = hora;
    }

    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
}
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
}
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
