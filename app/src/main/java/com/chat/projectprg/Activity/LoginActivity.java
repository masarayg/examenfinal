package com.chat.projectprg.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
<<<<<<< HEAD
import com.bumptech.glide.Glide;
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
import com.chat.projectprg.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private EditText txtCorreo,txtContraseña;
    private Button btnLogin,btnRegistro;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_login);

        txtCorreo = (EditText) findViewById(R.id.idCorreoLogin);
        txtContraseña = (EditText) findViewById(R.id.idContraseñaLogin);
        btnLogin = (Button) findViewById(R.id.idLoginLogin);
        btnRegistro = (Button) findViewById(R.id.idRegistroLogin);

<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
        mAuth = FirebaseAuth.getInstance();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String correo = txtCorreo.getText().toString();
                if(isValidEmail(correo) && validarContraseña()){
                    String contraseña = txtContraseña.getText().toString();

                    mAuth.signInWithEmailAndPassword(correo, contraseña)
                            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        Toast.makeText(LoginActivity.this, "Se logueo correctamente.", Toast.LENGTH_SHORT).show();
                                        nextActivity();
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Toast.makeText(LoginActivity.this, "Error, credenciales incorrectas.", Toast.LENGTH_SHORT).show();
                                    }

                                }

                            });
                }else{
                    Toast.makeText(LoginActivity.this, "Validaciones funcionando.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,RegistroActivity.class));
            }
        });



    }
    private boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
    public boolean validarContraseña(){
        String contraseña;
        contraseña = txtContraseña.getText().toString();
        if(contraseña.length()>=6 && contraseña.length()<=16){
            return true;
        }else return false;

    }

<<<<<<< HEAD
<<<<<<< HEAD
    //Recuperando Data para iniciar con el usuario digitado
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
=======
>>>>>>> 8a3d0ca465d1e1de7e15626cee112b3ba2995bcc
    @Override
    protected void onResume() {
        super.onResume();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser!=null){
            Toast.makeText(this, "Usuario logueado.", Toast.LENGTH_SHORT).show();
            nextActivity();
        }

    }



    private void nextActivity(){
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
        finish();

    }
}