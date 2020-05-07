package com.example.rfr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        textView = findViewById(R.id.text);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File file = new File("result.txt");
        GetTxtContent content = new GetTxtContent();
        String text = content.getFileContent(file);
        textView.setText(text);
    }
}
