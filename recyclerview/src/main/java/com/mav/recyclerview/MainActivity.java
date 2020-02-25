package com.mav.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int[] images;
    String[] names;
    RecyclerView R_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        R_view=findViewById(R.id.R_view);

        images=new int[]{
                R.drawable.jet,R.drawable.dropbox,R.drawable.instagram,R.drawable.twitter,R.drawable.snapchat};
        names=new String[]{"jet","dropbox","instagram","twitter","snapchat"};
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(MainActivity.this);

        SocialAdapter adapter=new SocialAdapter(MainActivity.this,getList(images,names));
        R_view.setLayoutManager(linearLayoutManager);
        R_view.setAdapter(adapter);
        }
        private List<SocialVersion> getList(int[] images,String[] names){
        List<SocialVersion> list=new ArrayList<>();
        for(int i=0;i<images.length;i++){
            SocialVersion version=new SocialVersion();
            version.setImage(images[i]);
            version.setName(names[i]);
            list.add(version);
        }
        return list;
        }
    }

