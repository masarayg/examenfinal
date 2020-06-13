package com.chat.projectprg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

<<<<<<< HEAD
<<<<<<< HEAD
import com.bumptech.glide.Glide;
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import com.chat.projectprg.Entidades.MensajeRecibir;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class AdapterMensaje extends RecyclerView.Adapter<HolderMensaje> {

<<<<<<< HEAD
<<<<<<< HEAD
    private List<MensajeRecibir> listMensaje = new ArrayList<>();
    private Context c;

    public AdapterMensaje(Context c) {
        this.c = c;
    }

    public void addMensaje(MensajeRecibir m){
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
 private   List<MensajeRecibir>  listMensaje = new ArrayList<>();

 private Context c;

    public AdapterMensaje (Context c) {
        this.c = c;
    }

    public void addMensaje (MensajeRecibir m)
    {
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        listMensaje.add(m);
        notifyItemInserted(listMensaje.size());
    }

    @Override
<<<<<<< HEAD
<<<<<<< HEAD
    public HolderMensaje onCreateViewHolder(ViewGroup parent, int viewType) {
=======
    public HolderMensaje onCreateViewHolder( ViewGroup parent, int viewType) {
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
    public HolderMensaje onCreateViewHolder( ViewGroup parent, int viewType) {
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        View v = LayoutInflater.from(c).inflate(R.layout.card_view_mensajes,parent,false);
        return new HolderMensaje(v);
    }

    @Override
<<<<<<< HEAD
<<<<<<< HEAD
    public void onBindViewHolder(HolderMensaje holder, int position) {
        holder.getNombre().setText(listMensaje.get(position).getNombre());
        holder.getMensaje().setText(listMensaje.get(position).getMensaje());
        if(listMensaje.get(position).getType_mensaje().equals("2")){
            holder.getFotoMensaje().setVisibility(View.VISIBLE);
            holder.getMensaje().setVisibility(View.VISIBLE);
            Glide.with(c).load(listMensaje.get(position).getUrlFoto()).into(holder.getFotoMensaje());
        }else if(listMensaje.get(position).getType_mensaje().equals("1")){
<<<<<<< HEAD
            holder.getFotoMensaje().setVisibility(View.GONE);
=======
                holder.getFotoMensaje().setVisibility(View.GONE);
>>>>>>> 5665aa0... version 3
            holder.getMensaje().setVisibility(View.VISIBLE);
        }
        if(listMensaje.get(position).getFotoPerfil().isEmpty()){
            holder.getFotoMensajePerfil().setImageResource(R.mipmap.ic_launcher);
             }else{
            Glide.with(c).load(listMensaje.get(position).getFotoPerfil()).into(holder.getFotoMensajePerfil());

        }
        Long codigoHora = listMensaje.get(position).getHora();
        Date d = new Date(codigoHora);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");//a pm o am
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    public void onBindViewHolder( HolderMensaje holder, int position) {
        holder.getNombre().setText(listMensaje.get(position).getNombre());
        holder.getMensaje().setText(listMensaje.get(position).getMensaje());
        holder.getMensaje().setVisibility(View.VISIBLE);

        long Codigohora = listMensaje.get(position).getHora();
        Date d = new Date(Codigohora);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        holder.getHora().setText(sdf.format(d));
    }

    @Override
    public int getItemCount() {
        return listMensaje.size();
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
