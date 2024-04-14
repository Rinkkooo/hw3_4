package com.example.hw3_4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw3_4.databinding.ItemContinentBinding;
import com.example.hw3_4.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<ViewHolderCountries> {

    private ArrayList<Country> countries;

    public CountryAdapter(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public ViewHolderCountries onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderCountries(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCountries holder, int position) {
        holder.onBind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}


class ViewHolderCountries extends RecyclerView.ViewHolder {

    private ItemCountryBinding binding;

    public ViewHolderCountries(@NonNull ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Country country) {
        binding.tvCountry.setText(country.getName());
        binding.tvCapital.setText(country.getCapital());
    }
}

