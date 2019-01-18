package com.example.ktc.hellow;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ktc.hellow.Recycle.AdapterClass;
import com.example.ktc.hellow.Recycle.Item;

import java.util.ArrayList;
import java.util.List;

public class homePage extends AppCompatActivity {
    private List<Item> itemList=new ArrayList<>();
    private RecyclerView recyclerView;
    private AdapterClass adapterClass;
    Button booking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        recyclerView=findViewById(R.id.recycleView);
         adapterClass=new AdapterClass(itemList);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         recyclerView.setAdapter(adapterClass);
        prepareData();
        booking=findViewById(R.id.booking);
        booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(homePage.this,seat.class);
                startActivity(intent);
            }
        });

    }

    private void prepareData() {
        Item item=new Item(R.drawable.login,"Prince Of Persia the two thrones","Date:7/1/2019,Time:11:30am");
        itemList.add(item);
        Item item1=new Item(R.drawable.avenger,"Avenger","Date:7/1/2019,Time:7:30pm");
        itemList.add(item1);
        Item item2=new Item(R.drawable.hellboy,"Hell Boy","Date:8/1/2019,Time:11:30am");
        itemList.add(item2);
        Item item3=new Item(R.drawable.zombieland2,"Zombie Land 2","Date:8/1/2019,Time:7:30pm");
        itemList.add(item3);
        Item item4=new Item(R.drawable.toystory4,"Toy story 4","Date:9/1/2019,Time:11:30am");
        itemList.add(item4);
        Item item5=new Item(R.drawable.starwars,"Star wars","Date:9/1/2019,Time:7:30pm");
        itemList.add(item5);
        Item item6=new Item(R.drawable.petsamatary,"Pet samatary","Date:10/1/2019,Time:11:30am");
        itemList.add(item6);
        Item item7=new Item(R.drawable.loinking,"Loin King","Date:10/1/2019,Time:7:30pm");
        itemList.add(item7);
        Item item8=new Item(R.drawable.loinking,"raees","Date:10/1/2019,Time:7:30pm");
        itemList.add(item8);
    }


}
