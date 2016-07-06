package com.example.familia.ejercicio10_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class main extends AppCompatActivity {

    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et2= (EditText)findViewById(R.id.et2);
    }

    public void verificar(View v)
    {
        String valor= et2.getText().toString();
        if(valor.length() == 0)
        {
            Toast notif= Toast.makeText(this,"Ingrese un valor para la clave",Toast.LENGTH_LONG);
            notif.show();
        }
    }
}
