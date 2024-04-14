package com.example.hw3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw3_4.databinding.FragmentContinentBinding;
import com.example.hw3_4.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<Country> countries = new ArrayList<>();
    private int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCountryBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CountryAdapter adapter = new CountryAdapter(countries);
        binding.rvCountry.setAdapter(adapter);
        position = getArguments().getInt("position", 0);
        checkPosition(position);

    }

    void checkPosition(int position) {
        if (position == 0) {
            loadAustralia();
        } else if (position == 1) {
            loadAmerica();
        } else if (position == 2) {
            loadAfrica();
        } else if (position == 3) {
            loadAsia();
        } else if (position == 4) {
            loadEurope();
        }
    }

    private void loadAustralia() {
        countries.add(new Country("Australia", "Canberra"));
        countries.add(new Country("Fiji", "Suva"));
        countries.add(new Country("Kiribati", "Tarawa"));
        countries.add(new Country("Micronesia", "Palikir"));
        countries.add(new Country("Nauru", "Yaren"));
    }

    private void loadAmerica() {
        countries.add(new Country("Bahamas", "Nassau"));
        countries.add(new Country("Barbados", "Bridgetown"));
        countries.add(new Country("Grenada", "St. George’s"));
        countries.add(new Country("Guatemala", "Guatemala"));
        countries.add(new Country("Haiti", "Port-au-Prince"));
    }

    private void loadAfrica() {
        countries.add(new Country("Abuja", "Nigeria"));
        countries.add(new Country("Accra", "Ghana"));
        countries.add(new Country("Algiers", "Algeria"));
        countries.add(new Country("Cairo", "Egypt"));
        countries.add(new Country("Dakar", "Senegal"));
    }

    private void loadAsia() {
        countries.add(new Country("Jordan", "Amman"));
        countries.add(new Country("Baghdad", "Iraq"));
        countries.add(new Country("Turkey", "Ankara"));
        countries.add(new Country("Dili", "Timor_Leste"));
        countries.add(new Country("Dhaka", "Bangladesh"));
    }

    private void loadEurope() {
        countries.add(new Country("Albania", "Tirana"));
        countries.add(new Country("Andorra", "Andorra la Vella"));
        countries.add(new Country("Cyprus", "Nicosia"));
        countries.add(new Country("Estonia", "Tallinn"));
        countries.add(new Country("France", "Paris"));
    }

}