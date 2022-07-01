package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {

    }

    private Button btn1, btn2, btn3;
    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); /* • permet de faire le lien avec le fichier xml ;
        • classe R : classe générée automatiquement par Android Studio, elle représente l'ensemble des ressources de
            notre application.
        • .layout : va chercher dans layout */

        /*
        1. Mettre un id unique sur la balise xml
            android:id="@=id/..."
        2. Créer un attribut du type de la balise
            private type nomvariable;   // valeur null
        3. Initialiser l'attribut dans la méthode onCreate():
            this.nomvariable = findViewById(R.id.nomId)

        */

        this.btn1 = findViewById(R.id.btn_un);
        this.btn2 = findViewById(R.id.btn_deux);
        this.btn3 = findViewById(R.id.btn_trois);
        this.edt = findViewById(R.id.edt_saisie);


        this.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code exécuté lors du clic
                Toast.makeText(MainActivity.this,"Le grand Kouach !",Toast.LENGTH_SHORT).show();
            }
        });

        this.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code exécuté lors du clic
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle(getResources().getString(R.string.popup_title))
                        .setCancelable(false)
                        .setMessage(getResources().getString(R.string.popup_message))
                        .setPositiveButton(getResources().getString(R.string.popup_btn_oui), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                            }
                        })
                        .setNegativeButton(getResources().getString(R.string.popup_btn_non), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .show();
            }
        });

        this.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code exécuté lors du clic
                String contenu = edt.getText().toString();

                if(contenu!=null && contenu.length()>1){
                    Intent in = new Intent(MainActivity.this,HelloActivity.class);
                    in.putExtra("valeur", contenu);
                    startActivity(in);
                }else{
                    edt.setError("Saisie obligatoire !!");
                }

            }
        });

    }
}