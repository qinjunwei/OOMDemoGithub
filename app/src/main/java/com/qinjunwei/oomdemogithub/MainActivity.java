package com.qinjunwei.oomdemogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qinjunwei.oomdemogithub.view.ImageSurfaceView;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageSurfaceView img = (ImageSurfaceView) findViewById(R.id.img);
        ArrayList<String> list = new ArrayList<>();
        try {
            img.setInputStream(getAssets().open("world.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
