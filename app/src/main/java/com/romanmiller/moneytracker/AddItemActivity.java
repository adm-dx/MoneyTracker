package com.romanmiller.moneytracker;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {

    private EditText name;
    private EditText amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        //setTitle(R.string.add_item_title); альтернатива для android: title в описании активности в manifest.xml

        name = findViewById(R.id.name);
        amount = findViewById(R.id.amount);
        final Button addBtn = findViewById(R.id.add_btn);

        TextWatcher watcher = new TextWatcher() {
            private boolean btnState;
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(name.getText().toString().trim().length() <= 0 || amount.getText().toString().trim().length() <= 0){
                    addBtn.setEnabled(false);
                }
                else addBtn.setEnabled(true);
            }
        };

        name.addTextChangedListener(watcher);
        amount.addTextChangedListener(watcher);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = name.getText().toString();
                String itemAmount = amount.getText().toString();
            }
        });
    }
}
