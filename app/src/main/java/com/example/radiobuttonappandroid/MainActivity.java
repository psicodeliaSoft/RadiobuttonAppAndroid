package com.example.radiobuttonappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.txt_valor1);
        et2=(EditText) findViewById(R.id.txt_valor2);
        tv1=(TextView) findViewById(R.id.txt_resultado);
        rb1=(RadioButton)findViewById(R.id.rb_sumar);
        rb2=(RadioButton)findViewById(R.id.rb_restar);
    }
    //Metodo para el boton calcular

    public void Calcular(View view){

        String valor1_String=et1.getText().toString();
        String valor2_String=et2.getText().toString();
        int valor1_int= Integer.parseInt(valor1_String);//Parseo valor string a entero
        int valor2_int= Integer.parseInt(valor2_String);

        if(rb1.isChecked()==true)//Si el radio button esta seleccionado y es verdad
             {
                 int suma = valor1_int+valor2_int;
                 String resultado=String.valueOf(suma);//convertir entero en string
                 tv1.setText(resultado);
             }else if(rb2.isChecked()==true){
            int resta=valor1_int-valor2_int;
            String resultado=String.valueOf(resta);
            tv1.setText(resultado);
            }
    }
}