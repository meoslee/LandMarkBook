package com.batuhanbugdayci.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.batuhanbugdayci.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();

        LandMark selectedLandmark = intent.getParcelableExtra("LandMark"); // "LandMark" olarak değiştirdik

        if (selectedLandmark != null) {
            binding.nameText.setText(selectedLandmark.getName());
            binding.countryText.setText(selectedLandmark.getCountry());
            binding.imageView.setImageResource(selectedLandmark.getImage());
        }
    }
}