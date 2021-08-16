package com.example.lessononeapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text_example);
    }

    /**
     * ems - типографский термин, единица измерения ширины текста, равная ширине латинской буквы m.
     * Применяется в TextView и EditText для определения ширины поля для текста.
     * Работает только в случае выбора значения layout_width "wrap_content".
     * То есть если указать android:ems="5", то это значит задать ширину поля для текста равную ширине пяти букв m.
     **/
}