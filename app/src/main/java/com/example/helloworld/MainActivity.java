package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Ender Watts García
 * @version 1.0
 * Aplicación que muestra el típico ejemplo de Hola Mundo
 * <ol>
 *     <li>Se ha visto cómo s ecrean los recursos en xml</li>
 *     <li>Se ha instanciado en java un objeto TextView</li>
 *     <li>Se ha personalizado la imagen de la aplicación</li>
 * </ol>
 */
public class MainActivity extends AppCompatActivity {

    private TextView tvMessageStart;
    private TextView tvMessageEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart=findViewById(R.id.tvMessageStart);
        tvMessageEnd=findViewById(R.id.tvMessageEnd);

        tvMessageStart.setTextColor(getColor(R.color.white));
        tvMessageEnd.setText(R.string.messageOptimist);


    }
}