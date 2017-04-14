package com.example.ferielkoulla.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btCompetences;
    private Button btExperiences;
    private Button btFormations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCompetences = (Button) findViewById(R.id.buttonCompetences);
        btCompetences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Competences.class);
                startActivity(intent);
            }
        });

        btExperiences = (Button) findViewById(R.id.buttonExperiences);
        btExperiences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Experiences.class);
                startActivity(intent);
            }
        });

        btFormations = (Button) findViewById(R.id.buttonFormation);
        btFormations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Formations.class);
                startActivity(intent);
            }
        });
    }


}
