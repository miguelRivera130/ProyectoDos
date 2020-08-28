package com.example.proyecto_semana_tres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button BotonPrincipal;
    private EditText Respuesta;
    private TextView Puntos;
    private TextView Operacion;
    private Problemas operaciones;
    private Boolean bienvenida;
    private int SelecPregunta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BotonPrincipal = findViewById(R.id.Boton);
        Respuesta = findViewById(R.id.Resultado);
        Puntos = findViewById(R.id.Puntuacion);
        Operacion = findViewById(R.id.Operaciones);
        operaciones = new Problemas();
        bienvenida = true;
        SelecPregunta = operaciones.getNumero();

        //acciones



        BotonPrincipal.setOnClickListener(

                    (v) -> {

                        String Solucion = "" + Respuesta.getText().toString();
                        if (Solucion == operaciones.getRespuesta() && bienvenida == false) {

                            SelecPregunta ++;
                            Puntos.setText("Puntaje:" + " " + SelecPregunta*15);

                        } else if(Solucion != operaciones.getRespuesta() && bienvenida == false){

                            Puntos.setText("Respuesta incorrecta:" + " " + "Responda nuevamente");
                        }
                }
        );

        BotonPrincipal.setOnClickListener(

                (v) -> {

                    if(bienvenida == true){

                        bienvenida = false;
                        Operacion.setText(operaciones.getCalculo());
                        BotonPrincipal.setText("Responder");
                    }

                }
        );
    }
}