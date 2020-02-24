package com.mav.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {
 EditText eT1;
 TextView t4;
 Button b2;
    Bundle bundle=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        eT1=findViewById(R.id.eT1);
        t4=findViewById(R.id.t4);
        b2=findViewById(R.id.b2);

       b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RelativeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
