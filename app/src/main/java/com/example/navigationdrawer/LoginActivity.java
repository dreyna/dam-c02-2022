package com.example.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText txtcorreo, txtclave;
    private Button botonenviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtcorreo = findViewById(R.id.edtcorreo);
        txtclave = findViewById(R.id.edtpassword);
        botonenviar = findViewById(R.id.btningresar);
        botonenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hola",Toast.LENGTH_LONG).show();

                Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent1);

            }
        });
    }
}