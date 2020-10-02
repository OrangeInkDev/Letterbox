package com.orangeink.letterbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
        List<CodeColors> codeColors = new ArrayList<>();
        codeColors.add(new CodeColors(0.40f, Color.RED));
        codeColors.add(new CodeColors(0.30f, Color.GREEN));
        codeColors.add(new CodeColors(0.20f, Color.BLUE));
        codeColors.add(new CodeColors(0.10f, Color.CYAN));
        layout.setBackground(new FractionDrawable(codeColors));
    }
}