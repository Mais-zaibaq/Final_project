package com.example.final_project;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private AppCompatButton btn6, btn7, btn8, btn5;
    private Adapter adapter;
    private RecyclerView rv;
    private ArrayList<ListItems> items = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_array, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        items.add(new ListItems("كنب تركي", "100$", R.drawable.p11));
        items.add(new ListItems("كنب تركي", "100$", R.drawable.p22));
        items.add(new ListItems("كنب تركي", "100$", R.drawable.p33));
        items.add(new ListItems("سجاد عجمي", "100$", R.drawable.p44));
        items.add(new ListItems("ستارة شيفون", "100$", R.drawable.p55));
        items.add(new ListItems("كنب تركي", "100$", R.drawable.p66));
        adapter = new Adapter(items);
        rv =view. findViewById(R.id.rv);
        rv.setAdapter(adapter);
        btn5 = view.findViewById(R.id.button5);
        btn6 = view.findViewById(R.id.button6);
        btn7 = view.findViewById(R.id.button7);
        btn8 = view.findViewById(R.id.button8);
    }

    private void lesiner() {
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setBackground(getActivity().getDrawable(R.drawable.btn_shape1));
                btn5.setTextColor(getActivity().getColor(R.color.white));
                btn6.setBackground(getActivity().getDrawable(R.drawable.back));
                btn6.setTextColor(getActivity().getColor(R.color.black));
                btn7.setBackground(getActivity().getDrawable(R.drawable.back));
                btn7.setTextColor(getActivity().getColor(R.color.black));
                btn8.setBackground(getActivity().getDrawable(R.drawable.back));
                btn8.setTextColor(getActivity().getColor(R.color.black));

            }
        });


    }
}