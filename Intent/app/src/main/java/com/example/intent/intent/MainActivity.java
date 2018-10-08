package com.example.intent.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button inte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUiViews();
        inte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//

//                Intent I = new Intent(this,ShowMessage.Class);
//                I.putExtra("message","hello");
//                startActivity(I);
                Intent i = new Intent(this, ActivityTwo.class);
                startActivity(i);
            }

        });
    }
    private void setupUiViews() {
        inte = (Button) findViewById(R.id.btni);
    }
    }
