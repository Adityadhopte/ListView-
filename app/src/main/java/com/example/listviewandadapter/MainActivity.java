package com.example.listviewandadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listviewandadapter.adapter.MyCustomAdapter;
import com.example.listviewandadapter.model.PlanetModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    ArrayList<PlanetModel> planetModelArrayList;

    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        planetModelArrayList = new ArrayList<>();

        PlanetModel planetModel = new PlanetModel("Earth", "5", R.drawable.earth);
        PlanetModel planetModel1 = new PlanetModel("Earth", "15", R.drawable.mars);
        PlanetModel planetModel2 = new PlanetModel("Earth", "54", R.drawable.mercury);
        PlanetModel planetModel3 = new PlanetModel("Earth", "35", R.drawable.neptune);
        PlanetModel planetModel4 = new PlanetModel("Earth", "52", R.drawable.pluto);
        PlanetModel planetModel5 = new PlanetModel("Earth", "45", R.drawable.uranus);
        PlanetModel planetModel6 = new PlanetModel("Earth", "55", R.drawable.venus);

        planetModelArrayList.add(planetModel);
        planetModelArrayList.add(planetModel1);
        planetModelArrayList.add(planetModel2);
        planetModelArrayList.add(planetModel3);
        planetModelArrayList.add(planetModel4);
        planetModelArrayList.add(planetModel5);
        planetModelArrayList.add(planetModel6);

        // Adapter
        adapter = new MyCustomAdapter(planetModelArrayList, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Plant name" + adapter.getItem(position).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}