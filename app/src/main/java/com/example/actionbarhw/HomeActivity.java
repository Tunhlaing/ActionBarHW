package com.example.actionbarhw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    TextView tvTitleMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(" Google");
        actionBar.setSubtitle(" gmail");
        actionBar.setIcon(R.drawable.ic_baseline_favorite_24);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        tvTitleMain = findViewById(R.id.tvTitleMain);
        tvTitleMain.setOnClickListener(view -> {
            Intent i = new Intent(this, ProductActivity.class);
            startActivity(i);
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { ////like findview by id
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navFavorite:
                Utils.showToast(this,"favorite is clicked");
                break;
            case R.id.navSearch:
                Utils.showToast(this,"Search is clicked");
                break;

            case R.id.navSetting:
                Utils.showToast(this,"Setting is clicked");
                break;
            case R.id.navCheck:
                Utils.showToast(this,"Check");
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}