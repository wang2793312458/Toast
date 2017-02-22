package com.velue.toast;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_error_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_success_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(MainActivity.this, "Success!", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_info_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.info(MainActivity.this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_warning_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.warning(MainActivity.this, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.button_normal_toast_wo_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.normal(MainActivity.this, "Normal toast w/o icon").show();
            }
        });
        findViewById(R.id.button_normal_toast_w_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable icon = getResources().getDrawable(R.drawable.ic_pets_white_48dp);
                Toasty.normal(MainActivity.this, "Normal toast w/ icon", icon).show();
            }
        });
    }
}
