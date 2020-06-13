package com.chat.projectprg.Entidades;

import com.chat.projectprg.Entidades.Mensaje;

public class MensajeRecibir extends Mensaje {

<<<<<<< HEAD
<<<<<<< HEAD
    private Long hora;
=======
    private  Long hora;
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
    private  Long hora;
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc

    public MensajeRecibir() {
    }

    public MensajeRecibir(Long hora) {
        this.hora = hora;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public MensajeRecibir(String mensaje, String urlFoto, String nombre, String fotoPerfil, String type_mensaje, Long hora) {
        super(mensaje, urlFoto, nombre, fotoPerfil, type_mensaje);
=======
    public MensajeRecibir(String mensaje, String nombre, String type_mensaje, Long hora) {
        super(mensaje, nombre, type_mensaje);
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
    public MensajeRecibir(String mensaje, String nombre, String type_mensaje, Long hora) {
        super(mensaje, nombre, type_mensaje);
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        this.hora = hora;
    }

    public Long getHora() {
        return hora;
    }

    public void setHora(Long hora) {
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
