package com.example.profilehp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileRelativeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //mhmd:BackEnd to RelativeSanner
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_relative);

        //  mhmd: Backend to backBotton
        TextView btnBack = findViewById(R.id.btn_back);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish(); // محمد :إغلاق الصفحة الحالية والعودة للسابقة
                }
            });
        }
    }
}