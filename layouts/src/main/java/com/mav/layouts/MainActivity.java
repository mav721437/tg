package com.mav.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Bundle bundle=null;
     Button button;
     EditText fn,mn,ln,pd,em,cpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bundle=getIntent().getExtras();
       if(bundle!=null){
    Toast.makeText(this,""+bundle.getString("callFrom"),Toast.LENGTH_LONG).show();
}
       button=findViewById(R.id.button);
       fn=findViewById(R.id.fn);
        mn=findViewById(R.id.mn);
        ln=findViewById(R.id.ln);
        em=findViewById(R.id.em);
        pd=findViewById(R.id.pd);
        cpd=findViewById(R.id.cpd);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });




}
private void checkvalidations(){
        if(fn.getText().toString().isEmpty()){
            Toast.makeText(this,"enter the fisrt name",Toast.LENGTH_SHORT).show();
        }
        else if(mn.getText().toString().isEmpty()){
            Toast.makeText(this,"enter the middle name",Toast.LENGTH_SHORT).show();
        }
        else if(ln.getText().toString().isEmpty()){
            Toast.makeText(this,"enter the last name",Toast.LENGTH_SHORT).show();
        }
        else if(em.getText().toString().isEmpty()){
            Toast.makeText(this,"enter the email address",Toast.LENGTH_SHORT).show();
        }
        else if(pd.getText().toString().length()<6){
            Toast.makeText(this,"enter the password",Toast.LENGTH_SHORT).show();
        }
        else if(cpd.getText().toString().equals(pd.getText().toString().length()<6)){
            Toast.makeText(this,"password not same",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent=new Intent(MainActivity.this,Dashboard.class);
            startActivity(intent);
        }
}
}
