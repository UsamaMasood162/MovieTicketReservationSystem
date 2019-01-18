package com.example.ktc.hellow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        setListner();
    }
    private void setListner() {
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(name.getText().toString().equals("admin") && password.getText().toString().equals("123456"))
            {
                Intent intent=new Intent(MainActivity.this,homePage.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }

    void initview()
    {
        btn= findViewById(R.id.login);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
    }
}
