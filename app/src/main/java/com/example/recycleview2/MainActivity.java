package com.example.recycleview2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(new Chapter(R.drawable.android_image_1, "Chapter one", "Android architecture"));
        chapters.add(new Chapter(R.drawable.android_image_2, "Chapter two", "Android layout"));
        chapters.add(new Chapter(R.drawable.android_image_3, "Chapter three", "Android activity"));
        chapters.add(new Chapter(R.drawable.android_image_4, "Chapter four", "Android event"));
        chapters.add(new Chapter(R.drawable.android_image_5, "Chapter five", "Android intent"));
        chapters.add(new Chapter(R.drawable.android_image_6, "Chapter six", "Android recycleview"));

        RecyclerView rec = findViewById(R.id.rec_chapter);

    }
}