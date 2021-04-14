package com.example.homework6.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework6.R;
import com.example.homework6.SanPham;
import com.example.homework6.fragment_phone.SanPhamAdapter;

import java.util.ArrayList;

public class FragmentLaptop extends Fragment {

    RecyclerView recyclerView;
    ArrayList<SanPham> listSanPham;
    SanPhamAdapter sanPhamAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_laptop, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = getView().findViewById(R.id.recyclerviewLaptop);
        listSanPham = new ArrayList<>();
        sanPhamAdapter = new SanPhamAdapter(requireContext(), listSanPham);
        sanPhamAdapter.setData(getAll());
        LinearLayoutManager manager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(sanPhamAdapter);
    }

    private ArrayList<SanPham> getAll(){
        ArrayList<SanPham> sanPhams = new ArrayList<>();
        sanPhams.add(new SanPham("Macbook pro 13", 30000000, R.drawable.macbookpro));
        sanPhams.add(new SanPham("Macbook air 13", 26000000, R.drawable.macbookair));
        sanPhams.add(new SanPham("Asus X509", 15690000, R.drawable.asusx509));

        return sanPhams;
    }
}