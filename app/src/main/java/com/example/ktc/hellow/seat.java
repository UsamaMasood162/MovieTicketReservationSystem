package com.example.ktc.hellow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class seat extends AppCompatActivity {
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat);
        initview();
        setListner();
    }

    private void initview() {
        submit=findViewById(R.id.submit);
    }

    private void setListner() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(seat.this,SeatInformation.class);
                startActivity(intent);
            }
        });
    }
}
