package com.chat.projectprg.Entidades;

public class Mensaje {
<<<<<<< HEAD
<<<<<<< HEAD

    private String mensaje;
    private String urlFoto;
    private String nombre;
    private String fotoPerfil;
    private String type_mensaje;

    public Mensaje() {
    }

    public Mensaje(String mensaje, String nombre, String fotoPerfil, String type_mensaje) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.fotoPerfil = fotoPerfil;
        this.type_mensaje = type_mensaje;
    }

    public Mensaje(String mensaje, String urlFoto, String nombre, String fotoPerfil, String type_mensaje) {
        this.mensaje = mensaje;
        this.urlFoto = urlFoto;
        this.nombre = nombre;
        this.fotoPerfil = fotoPerfil;
        this.type_mensaje = type_mensaje;
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    private String mensaje;
    private String nombre;
    private String type_mensaje;


    //Datos del chat
    public Mensaje(String mensaje, String nombre,String type_mensaje) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.type_mensaje = type_mensaje;
    }

    //Constructor vacio para la Db
    public  Mensaje(){

    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    public String getType_mensaje() {
        return type_mensaje;
    }

    public void setType_mensaje(String type_mensaje) {
        this.type_mensaje = type_mensaje;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }
}
=======
}
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
}
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
