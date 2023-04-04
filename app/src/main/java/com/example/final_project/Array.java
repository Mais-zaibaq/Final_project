package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Array extends AppCompatActivity {
    private AppCompatButton btn6, btn7, btn8, btn5;
    private Adapter adapter;
    private RecyclerView rv;
    private ArrayList<ListItems> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        items.add(new ListItems("كنب تركي", "100$", R.drawable.p11));
        items.add(new ListItems("كنب تركي", "100$", R.drawable.p22));
        items.add(new ListItems("كنب تركي", "100$", R.drawable.p33));
        items.add(new ListItems("سجاد عجمي", "100$", R.drawable.p44));
        items.add(new ListItems("ستارة شيفون", "100$", R.drawable.p55));
        items.add(new ListItems("كنب تركي", "100$", R.drawable.p66));
        adapter = new Adapter(items);
        rv = findViewById(R.id.rv);
        rv.setAdapter(adapter);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
    }


    private void lesiner() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setBackground(getDrawable(R.drawable.btn_shape1));
                btn5.setTextColor(getColor(R.color.white));
                btn6.setBackground(getDrawable(R.drawable.back));
                btn6.setTextColor(getColor(R.color.black));
                btn7.setBackground(getDrawable(R.drawable.back));
                btn7.setTextColor(getColor(R.color.black));
                btn8.setBackground(getDrawable(R.drawable.back));
                btn8.setTextColor(getColor(R.color.black));

            }
        });


    }
}


