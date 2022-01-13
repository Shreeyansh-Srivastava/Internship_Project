package com.example.admybrand_git_api;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admybrand_git_api.databinding.ActivityMainBinding;
import com.google.android.material.progressindicator.BaseProgressIndicator;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.button.setOnClickListener(view1->{
           Intent intent = new Intent(this,Git_Id_searchpage.class);
        });
    }
}