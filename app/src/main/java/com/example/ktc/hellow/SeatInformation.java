package com.example.ktc.hellow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SeatInformation extends AppCompatActivity {
    Spinner selectseat;
    Button confirm;
    EditText NumberOfSeats;
    TextView TotalSeats,Result;
    int seats;
    String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_information);
        addItemOnSpinner();
        initview();
        getValues();
    }

    private void getValues() {
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SeatInformation.this, "Seats Have Been booked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initview() {
        confirm=findViewById(R.id.confirm);
        NumberOfSeats=findViewById(R.id.NumberOfSeats);
        TotalSeats=findViewById(R.id.totalSeats);


    }

    private void addItemOnSpinner() {
        selectseat=findViewById(R.id.selectseat);
        List<String>list=new ArrayList<String>();
        list.add("Golden");
        list.add("Silver");
        list.add("Bronze");
        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);
        selectseat.setAdapter(dataAdapter);

    }
}
