package com.example.profilehp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileConstraintActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //mhmd:BackEnd to constraintSanner
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_constraint);

        //  mhmd: Backend to backBotton
        TextView btnBack = findViewById(R.id.btn_back_c);
        if (btnBack != null) {
            btnBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish(); // محمد:إغلاق الصفحة الحالية والعودة للسابقة
                }
            });
        }
    }
}