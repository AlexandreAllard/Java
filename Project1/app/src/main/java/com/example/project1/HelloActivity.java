package com.example.project1;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

    /*
        Intent --> 2 rôles :
            1) Appeler un service et récupérer le résultat
            2) Ouvrir une autre Activity
        Intent i = new Intent(  A.this   ,  B.this   );
        startActivity(   i ); -->intent
    */
        tv = findViewById(R.id.tv_s);
        String s = getIntent().getStringExtra("valeur");
        tv.setText(s);



    }
}
