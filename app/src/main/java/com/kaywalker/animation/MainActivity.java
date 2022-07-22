package com.kaywalker.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    Button btn_login;
    Button btn_booking;
    Button btn_address;
    Button btn_good;

    ViewPager2 viewPager;

    int[] images = {R.drawable.passorder_home, R.drawable.passorder_main, R.drawable.passorder_login, R.drawable.passorder_slide};

    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = findViewById(R.id.btn_login);
        btn_booking = findViewById(R.id.btn_booking);
        btn_address = findViewById(R.id.btn_address);
        btn_good = findViewById(R.id.btn_good);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this ,LoginActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        btn_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , BookingActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        btn_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AddressActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        btn_good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , GoodActivity.class);
                startActivity(intent); // 액티비티 이동
            }
        });

        viewPager =findViewById(R.id.viewPager);

        itemAdapter = new ItemAdapter(images);

        viewPager.setAdapter(itemAdapter);
    }

    private void makeMsg() {
        Toast toast =Toast.makeText(this,"메세지입니다. ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.TOP, 50, 500);
        toast.show();
    }

}