package com.orangeink.letterbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    View layout;
    private final RelativeLayout btn = findViewById(R.id.btn_add);
    private final TextView tv = findViewById(R.id.text);

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


       btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(tv.getText().toString());
                tv.setText(num+1);
            }
        });
    }
}