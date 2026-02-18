package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;


public class BlankFragment extends Fragment {

    private EditText editTextInput;
    private Button buttonShow;
    private TextView textViewResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        editTextInput = view.findViewById(R.id.editTextInput);
        buttonShow = view.findViewById(R.id.buttonShow);
        textViewResult = view.findViewById(R.id.textViewResult);

        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextInput.getText().toString();

                if (!inputText.isEmpty()) {
                    textViewResult.setText("Вы ввели: " + inputText);
                } else {
                    textViewResult.setText("Пожалуйста, введите текст!");
                }
            }
        });

        return view;
    }
}