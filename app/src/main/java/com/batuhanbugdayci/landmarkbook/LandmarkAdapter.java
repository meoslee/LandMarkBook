package com.batuhanbugdayci.landmarkbook;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.batuhanbugdayci.landmarkbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

  public ArrayList<LandMark> landmarkArrayList;



    public LandmarkAdapter(ArrayList<LandMark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()) ,parent,false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(LandmarkAdapter.LandmarkHolder holder, int position) {
        int itemPosition = holder.getAdapterPosition();

        holder.binding.recyclerViewTextView.setText(landmarkArrayList.get(itemPosition).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LandMark selectedLandmark = landmarkArrayList.get(itemPosition);
                Intent intent = new Intent (holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("LandMark",selectedLandmark);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size(); // Veri listesindeki öğe sayısını döndürün.
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;
        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
