package com.batuhanbugdayci.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.batuhanbugdayci.landmarkbook.databinding.ActivityDetailsBinding;
import com.batuhanbugdayci.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<LandMark> landMarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landMarkArrayList = new ArrayList<>();

        //Data
        LandMark pisa = new LandMark("Pisa", "Italy", R.drawable.pisa);
        LandMark eiffel = new LandMark("Eiffel", "French" , R.drawable.eiffeltower);
        LandMark colosseum = new LandMark("Colosseum", "Rome", R.drawable.colosseum);
        LandMark londonBrige = new LandMark("LondonBrige", "England", R.drawable.londonbrige);


        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBrige);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landMarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);


    }
}