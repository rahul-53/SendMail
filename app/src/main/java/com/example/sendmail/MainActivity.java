package com.example.sendmail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mBtnSend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViewsAndListeners();
    }
    private  void initializeViewsAndListeners(){
        mBtnSend = findViewById(R.id.tvBtnSend);

        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"Hi Sir, This mail is regarding my leaves I won't be able to attend  the team meetings due to health issues. Kindly excuse my absence");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"ryadav75803@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Regarding leave");
                intent.putExtra(Intent.EXTRA_CC, new String[]{"dcos@gmail.com"});
                intent.setType("message/rfc822");
                startActivity(intent);


            }
        });
    }
}