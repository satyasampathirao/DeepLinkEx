package com.admin.deeplinkex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    //this activity is to get data from url in deep link


    TextView tvdeep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        Uri data = intent.getData();

        Log.d("deeplink", data.getQueryParameters("data")+"");


        //http://www.example.com/cricket?data=12345
        tvdeep= (TextView)findViewById(R.id.tvdeep);
        tvdeep.setText(data.getQueryParameters("data")+"\n"+data.getPath()+"\n"+data.getQuery());


    }
}
