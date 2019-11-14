package com.example.devkey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Membro extends AppCompatActivity {

    FloatingActionButton btn_cad_mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membro);
        inicializarObjetos();
    }

    public void inicializarObjetos(){
        btn_cad_mb =  (FloatingActionButton)findViewById(R.id.btn_cad_mb);
        abrirActivityCadMb();
    }

    public void abrirActivityCadMb(){
        btn_cad_mb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Membro.this, CadMembro.class);
                startActivity(intent);
            }
        });
    }
}
