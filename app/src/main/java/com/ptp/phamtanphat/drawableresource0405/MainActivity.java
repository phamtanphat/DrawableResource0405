package com.ptp.phamtanphat.drawableresource0405;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgClipDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgClipDrawable = findViewById(R.id.imageviewclipdrawable);

        final ClipDrawable clipDrawable = (ClipDrawable) imgClipDrawable.getDrawable();

//        imgClipDrawable.setImageLevel();

        imgClipDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clipDrawable.setLevel(clipDrawable.getLevel() + 1000);
            }
        });
    }
}
