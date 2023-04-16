package com.example.funcionesmatematicas;

import static com.example.funcionesmatematicas.R.id.txtnumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText t1, t2;
   EditText txtresultado;
   Button BtnSumar;
    Button BtnRestar;
    Button BtnDividir;
    Button BtnMulti;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText)findViewById(R.id.txtnumero1);
        t2 = (EditText)findViewById(R.id.txtnumero2);
        txtresultado = (EditText)findViewById(R.id.ibresultado);
        BtnSumar = (Button)findViewById(R.id.btnsumar);
        BtnSumar.setOnClickListener(this::Sumar);

        BtnRestar = (Button)findViewById(R.id.btnrestar);
        BtnRestar.setOnClickListener(this::Restar);

        BtnDividir = (Button)findViewById(R.id.btndivision);
        BtnDividir.setOnClickListener(this::Dividir);

        BtnMulti = (Button)findViewById(R.id.btnmultiplicacion);
        BtnMulti.setOnClickListener(this::Multiplicar);

    }
    public void Sumar(View v) {
        int n1=Integer.parseInt(t1.getText().toString());
        int n2=Integer.parseInt(t2.getText().toString());
        int resultado=n1+n2;
        txtresultado.setText(String.valueOf(resultado));

    }
    public void Restar(View v) {
        int n1=Integer.parseInt(t1.getText().toString());
        int n2=Integer.parseInt(t2.getText().toString());
        int resultado=n1-n2;
        txtresultado.setText(String.valueOf(resultado));

    }

    public void Dividir(View v) {
        int n1=Integer.parseInt(t1.getText().toString());
        int n2=Integer.parseInt(t2.getText().toString());
        int resultado=n1/n2;
        txtresultado.setText(String.valueOf(resultado));

    }

    public void Multiplicar(View v) {
        int n1=Integer.parseInt(t1.getText().toString());
        int n2=Integer.parseInt(t2.getText().toString());
        int resultado=n1*n2;
        txtresultado.setText(String.valueOf(resultado));

    }


    @Override
    public void onClick(View view) {

    }
}