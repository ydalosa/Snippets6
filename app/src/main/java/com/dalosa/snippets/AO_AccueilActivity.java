package com.dalosa.snippets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dalosa.snippets.a1_layout_xml.A11_LinearLayoutXml;

public class AO_AccueilActivity extends AppCompatActivity {

    /** VARIABLES GLOBALES **/
    TextView tvLinearLayout;

    /** Méthode pour lier design au code **/
   public void initUI(){
        tvLinearLayout = findViewById(R.id.tvLinearLayout);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0_accueil);
        initUI();

        tvLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                                                        //Départ                     // Arrivée
                Intent intent = new Intent(AO_AccueilActivity.this, A11_LinearLayoutXml.class);
                startActivity(intent);
            }
        });
    }
}