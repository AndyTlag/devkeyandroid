package com.example.devkey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_membro;
    Button btn_cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarObjetos();
    }

    public void inicializarObjetos(){
        btn_membro = (Button) findViewById(R.id.btn_membro);
        abrirActivityCadMb();

        btn_cliente = (Button) findViewById(R.id.btn_cliente);
        abrirActivityCadCli();
    }

    public void abrirActivityCadMb(){
        btn_membro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Membro.class);
                startActivity(intent);
            }
        });
    }

    public void abrirActivityCadCli(){
        btn_cliente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Cliente.class);
                startActivity(intent);
            }
        });
    }

}
