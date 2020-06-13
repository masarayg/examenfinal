package com.chat.projectprg.Activity;

import androidx.annotation.NonNull;
<<<<<<< HEAD
<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
<<<<<<< HEAD
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
=======
import android.widget.TextView;
import android.widget.Toast;

>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
import android.widget.TextView;
import android.widget.Toast;

>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import com.chat.projectprg.AdapterMensaje;
import com.chat.projectprg.Entidades.MensajeEnviar;
import com.chat.projectprg.Entidades.MensajeRecibir;
import com.chat.projectprg.Entidades.Usuario;
import com.chat.projectprg.R;
<<<<<<< HEAD
<<<<<<< HEAD
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
<<<<<<< HEAD
<<<<<<< HEAD
import com.google.firebase.storage.UploadTask;

import de.hdodenhof.circleimageview.CircleImageView;
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc


public class MainActivity extends AppCompatActivity {

<<<<<<< HEAD
<<<<<<< HEAD
    private ImageView fotoPerfil;
    private TextView nombre;
    private RecyclerView rvMensajes;
    private EditText txtMensaje;
    private Button btnEnviar,cerrarSesion;
    private AdapterMensaje adapter;
    private ImageButton btnEnviarFoto;

=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc

    //Funciones private
    private TextView nombre;
    private RecyclerView rvMensajes;
    private EditText txtMensaje;
    private Button btnEnviar, cerrarSesion;
    private AdapterMensaje adapter;

    //Objetos para base de datos
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    private FirebaseStorage storage;
    private StorageReference storageReference;
<<<<<<< HEAD
<<<<<<< HEAD
    private static final int PHOTO_SEND = 1;
    private static final int PHOTO_PERFIL = 2;
    private String fotoPerfilCadena;

=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    private FirebaseAuth mAuth;
    private String NOMBRE_USUARIO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
<<<<<<< HEAD
        fotoPerfil = (ImageView) findViewById(R.id.fotoPerfil);
        nombre = (TextView) findViewById(R.id.nombre);
        rvMensajes = (RecyclerView) findViewById(R.id.rvMensajes);
        txtMensaje = (EditText) findViewById(R.id.txtMensaje);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviarFoto = (ImageButton) findViewById(R.id.btnEnviarFoto);
        cerrarSesion = (Button) findViewById(R.id.cerrarSesion);
        fotoPerfilCadena = "";

        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("chatV2");//Sala de chat (nombre) version 2
        storage = FirebaseStorage.getInstance();
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc

        nombre = findViewById(R.id.nombre);
        rvMensajes = findViewById(R.id.rvMensajes);
        txtMensaje = findViewById(R.id.txtMensaje);
        btnEnviar = findViewById(R.id.btnEnviar);
        cerrarSesion = (Button) findViewById(R.id.cerrarSesion);


        //Inicializar componentes del Database
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("chatV2"); //Sala del Chat version 2
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        mAuth = FirebaseAuth.getInstance();

        adapter = new AdapterMensaje(this);
        LinearLayoutManager l = new LinearLayoutManager(this);
        rvMensajes.setLayoutManager(l);
        rvMensajes.setAdapter(adapter);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
<<<<<<< HEAD
<<<<<<< HEAD
            public void onClick(View view) {
                databaseReference.push().setValue(new MensajeEnviar(txtMensaje.getText().toString(),NOMBRE_USUARIO,fotoPerfilCadena,"1", ServerValue.TIMESTAMP));
                txtMensaje.setText("");
=======
            public void onClick(View v) {
               databaseReference.push().setValue(new MensajeEnviar(txtMensaje.getText().toString(),NOMBRE_USUARIO,"1", ServerValue.TIMESTAMP));
               txtMensaje.setText("");
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
            public void onClick(View v) {
               databaseReference.push().setValue(new MensajeEnviar(txtMensaje.getText().toString(),NOMBRE_USUARIO,"1", ServerValue.TIMESTAMP));
               txtMensaje.setText("");
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
            }
        });

        cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                returnLogin();
            }
        });

<<<<<<< HEAD
<<<<<<< HEAD
        btnEnviarFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                i.setType("image/jpeg");
                i.putExtra(Intent.EXTRA_LOCAL_ONLY,true);
                startActivityForResult(Intent.createChooser(i,"Selecciona una foto"),PHOTO_SEND);
            }
        });

        fotoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                i.setType("image/jpeg");
                i.putExtra(Intent.EXTRA_LOCAL_ONLY,true);
                startActivityForResult(Intent.createChooser(i,"Selecciona una foto"),PHOTO_PERFIL);
            }
        });

=======
        //Despliegue de texto
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
        //Despliegue de texto
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onItemRangeInserted(int positionStart, int itemCount) {
                super.onItemRangeInserted(positionStart, itemCount);
                setScrollbar();
            }
        });

<<<<<<< HEAD
<<<<<<< HEAD

        //De esta manera los otros usuarios reciben una notificacion, en pocas palabras un mensaje, esto se hace directamente en firebase
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                MensajeRecibir m = dataSnapshot.getValue(MensajeRecibir.class);
                adapter.addMensaje(m);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        databaseReference.addChildEventListener(new ChildEventListener() {

         //Agregando datos de Db a nuestra lista
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    MensajeRecibir m = dataSnapshot.getValue(MensajeRecibir.class);
                    adapter.addMensaje(m);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc

            }

            @Override
<<<<<<< HEAD
<<<<<<< HEAD
            public void onChildRemoved(DataSnapshot dataSnapshot) {
=======
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc

            }

            @Override
<<<<<<< HEAD
<<<<<<< HEAD
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {
=======
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc

            }

            @Override
<<<<<<< HEAD
<<<<<<< HEAD
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        verifyStoragePermissions(this);

    }

    //scroll para los carview y posicionarnos en el ultimo mensaje ingresado usamos getItemCount -1
    private void setScrollbar(){
        rvMensajes.scrollToPosition(adapter.getItemCount()-1);
    }

    public static boolean verifyStoragePermissions(Activity activity) {
        String[] PERMISSIONS_STORAGE = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };
        //Creamos permisos para el Storage
        int REQUEST_EXTERNAL_STORAGE = 1;
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
            return false;
        }else{
            return true;
        }
    }


    //envio de fotos, usamos una referencia del download para poder descargar la imagen en nuestros cardview
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            if (requestCode == PHOTO_SEND && resultCode == RESULT_OK) {
<<<<<<< HEAD
                Uri u = data.getData();
=======
                               Uri u = data.getData();
>>>>>>> 5665aa0... version 3

                storageReference = storage.getReference("imagenes_mensajeria");
                final StorageReference referenciaFoto = storageReference.child("image " + u.getLastPathSegment());
                referenciaFoto.putFile(u).addOnSuccessListener(this, new OnSuccessListener<UploadTask.TaskSnapshot>() {

                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        referenciaFoto.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                MensajeEnviar m = new MensajeEnviar(NOMBRE_USUARIO + " te ha enviado una foto", uri.toString(), NOMBRE_USUARIO, fotoPerfilCadena, "2", ServerValue.TIMESTAMP);
                                databaseReference.push().setValue(m);

                            }
                        });
                    }
                });
            } else if (requestCode == PHOTO_PERFIL && resultCode == RESULT_OK) {
                Uri u = data.getData();
                storageReference = storage.getReference("Foto_perfil");
                final StorageReference referenciaFoto = storageReference.child("imageperfil " + u.getLastPathSegment());
                referenciaFoto.putFile(u).addOnSuccessListener(this, new OnSuccessListener<UploadTask.TaskSnapshot>() {

                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        referenciaFoto.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                            @Override
                            public void onSuccess(Uri uri) {
                                fotoPerfilCadena = uri.toString();
                                MensajeEnviar m = new MensajeEnviar(NOMBRE_USUARIO + " Ha cambiado su foto de perfil", uri.toString(), NOMBRE_USUARIO, fotoPerfilCadena, "2", ServerValue.TIMESTAMP);
                                databaseReference.push().setValue(m);
                                Glide.with(MainActivity.this).load(uri.toString()).into(fotoPerfil);

                            }
                        });
                    }
                });
            }
        }
        catch (Exception ex){
            Toast.makeText(this, "Error " + ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

//devolvemos los datos del usuario en este caso el nombre y lo mostramos en el cardview
    @Override
    protected  void onResume(){
        super.onResume();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser!=null){
            btnEnviar.setEnabled(false);
            DatabaseReference reference = database.getReference("Usuario/"+currentUser.getUid());
            reference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    Usuario usuario = dataSnapshot.getValue(Usuario.class);
                    NOMBRE_USUARIO = usuario.getNombre();
                    nombre.setText(NOMBRE_USUARIO);
                    btnEnviar.setEnabled(true);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }else{
            returnLogin();
        }
    }
//finalizamos todas las acciones al cerrar la sesion y retornamos al login
    private  void returnLogin(){
        startActivity(new Intent(MainActivity.this, LoginActivity.class) );
        finish();
    }
}
=======
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    //despliegue sin afectar el texto en pantalla
     private void setScrollbar(){
        rvMensajes.scrollToPosition(adapter.getItemCount()-1);

     }

     //envio de imagen
   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        storageReference = storage.getReference("Imagenes_chat");// storage imagenes
    }*/
   @Override
   protected  void onResume(){
       super.onResume();
       FirebaseUser currentUser = mAuth.getCurrentUser();
       if(currentUser!=null){
           btnEnviar.setEnabled(false);
           DatabaseReference reference = database.getReference("Usuario/"+currentUser.getUid());
           reference.addListenerForSingleValueEvent(new ValueEventListener() {
               @Override
               public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                   Usuario usuario = dataSnapshot.getValue(Usuario.class);
                   NOMBRE_USUARIO = usuario.getNombre();
                   nombre.setText(NOMBRE_USUARIO);
                   btnEnviar.setEnabled(true);
               }

               @Override
               public void onCancelled(@NonNull DatabaseError databaseError) {

               }
           });
       }else{
        returnLogin();
       }
   }

   private  void returnLogin(){
       startActivity(new Intent(MainActivity.this, LoginActivity.class) );
       finish();
   }
}
<<<<<<< HEAD
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
