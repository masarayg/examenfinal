package com.chat.projectprg;

import android.annotation.SuppressLint;
import android.view.View;
<<<<<<< HEAD
<<<<<<< HEAD
import android.widget.ImageView;
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

<<<<<<< HEAD
<<<<<<< HEAD


public class HolderMensaje extends RecyclerView.ViewHolder {

    private TextView nombre;
    private TextView mensaje;
    private TextView hora;
    private ImageView fotoMensajePerfil;
    private ImageView fotoMensaje;

    public HolderMensaje(View itemView) {
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import de.hdodenhof.circleimageview.CircleImageView;

public class HolderMensaje extends RecyclerView.ViewHolder {


    private TextView nombre;
    private TextView mensaje;
    private TextView hora;
   // private CircleImageView fotoMensaje;





    @SuppressLint("WrongViewCast")
    public HolderMensaje(View itemView) {

<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        super(itemView);
        nombre = (TextView) itemView.findViewById(R.id.nombreMensaje);
        mensaje = (TextView) itemView.findViewById(R.id.mensajeMensaje);
        hora = (TextView) itemView.findViewById(R.id.horaMensaje);
<<<<<<< HEAD
<<<<<<< HEAD
        fotoMensajePerfil = (ImageView) itemView.findViewById(R.id.fotoPerfilMensaje);
        fotoMensaje = (ImageView) itemView.findViewById(R.id.mensajeFoto);
=======
        //fotoMensaje  = (CircleImageView)  itemView.findViewById(R.id.mensajeFoto);
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
        //fotoMensaje  = (CircleImageView)  itemView.findViewById(R.id.mensajeFoto);
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public TextView getMensaje() {
        return mensaje;
    }

    public void setMensaje(TextView mensaje) {
        this.mensaje = mensaje;
    }

    public TextView getHora() {
        return hora;
    }

    public void setHora(TextView hora) {
        this.hora = hora;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public ImageView getFotoMensajePerfil() {
        return fotoMensajePerfil;
    }

    public void setFotoMensajePerfil(ImageView fotoMensajePerfil) {
        this.fotoMensajePerfil = fotoMensajePerfil;
    }

    public ImageView getFotoMensaje() {
        return fotoMensaje;
    }

    public void setFotoMensaje(ImageView fotoMensaje) {
        this.fotoMensaje = fotoMensaje;
    }
}
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
  /*  public CircleImageView getFotoMensaje() {
        return fotoMensaje;
    }

    public void setFotoMensaje(CircleImageView fotoMensaje) {
        this.fotoMensaje = fotoMensaje;
    }*/
}
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
