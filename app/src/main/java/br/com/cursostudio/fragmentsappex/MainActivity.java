package br.com.cursostudio.fragmentsappex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFragRed;
    private Button btnFragGreen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initView();
addFragment(new Fragmento2());
addFragment2(new Fragmento1());

    }

    private void initView() {
        btnFragGreen = findViewById(R.id.btnGreen);
        btnFragRed = findViewById(R.id.btnRed);
    }
    private void addFragment(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container2, fragment);
        transaction.addToBackStack("FRAGMENTS");
        transaction.commit();

    }
 private void addFragment2(Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container1, fragment);
        transaction.addToBackStack("FRAGMENTS");
        transaction.commit();

    }


    }

