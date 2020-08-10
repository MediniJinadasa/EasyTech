package com.example.easytach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class DashboardActivity extends AppCompatActivity {
    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.TYPE_INPUT_METHOD_DIALOG);
        setContentView(R.layout.activity_dashboard_activity);

        cardView=(CardView) findViewById(R.id.btnServices);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openServices();
            }
        });

        cardView=(CardView) findViewById(R.id.btnResourcrs);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReaourcrs();
            }
        });

        cardView=(CardView) findViewById(R.id.btnWhy);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEasyTech();
            }
        });

        cardView=(CardView) findViewById(R.id.btnContactUs);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContactUs();
            }
        });

        cardView=(CardView) findViewById(R.id.btnAboutUs);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUs();
            }
        });


    }

    public void openServices(){
        Intent intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
    }

    public void openReaourcrs(){
        Intent intent = new Intent(this, ResourcrsActivity.class);
        startActivity(intent);
    }

    public void openEasyTech(){
        Intent intent = new Intent(this, EasyTech.class);
        startActivity(intent);
    }

    public void openContactUs(){
        Intent intent = new Intent(this, ContactUsActivity.class);
        startActivity(intent);
    }

    public void openAboutUs(){
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }

}