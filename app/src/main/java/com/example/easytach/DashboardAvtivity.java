package com.example.easytach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class DashboardAvtivity  extends AppCompatActivity {
    private CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.TYPE_INPUT_METHOD_DIALOG);
        setContentView(R.layout.activity_dashboard_avtivity);

        cardView=(CardView) findViewById(R.id.btnDoctor);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDoctor();
            }
        });

        cardView=(CardView) findViewById(R.id.btnHospital);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHospital();
            }
        });

        cardView=(CardView) findViewById(R.id.btnAppoinment);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppoinment();
            }
        });

        cardView=(CardView) findViewById(R.id.btnSpecial);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpecial();
            }
        });

        cardView=(CardView) findViewById(R.id.btnProfiles2);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile22();
            }
        });


    }

    public void openDoctor(){
        Intent intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
    }

    public void openHospital(){
        Intent intent = new Intent(this, ResourcrsActivity.class);
        startActivity(intent);
    }

    public void openAppoinment(){
        Intent intent = new Intent(this, EasyTech.class);
        startActivity(intent);
    }

    public void openSpecial(){
        Intent intent = new Intent(this, ContactUsActivity.class);
        startActivity(intent);
    }

    public void openProfile22(){
        Intent intent = new Intent(this, AboutUsActivity.class);
        startActivity(intent);
    }

}


