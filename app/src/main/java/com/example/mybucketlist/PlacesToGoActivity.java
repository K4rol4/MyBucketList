package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Vietnam", "Con Dao Islands, Hanoi, Halong Bay, Hoi An, Lang Co.", R.drawable.vietnam, 5),
                new BucketListEntry("Kerala, India", "Tru varied tea flawors, stay in houseboat, the fabulous food", R.drawable.kerala, 4),
                new BucketListEntry("Japan", "Hot springs, sushi, bamboo forest.", R.drawable.japan, 5),
                new BucketListEntry("Iceland", "Dynjandi Waterfall.", R.drawable.iceland, 5),
                new BucketListEntry("The Amazon, Brazil", "Try to survive being scared by all the creepy crawlies.", R.drawable.amazon, 5)
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}