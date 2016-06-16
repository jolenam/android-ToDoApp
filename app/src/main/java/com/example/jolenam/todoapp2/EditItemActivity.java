package com.example.jolenam.todoapp2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditItem;
    int itemPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etEditItem = (EditText) findViewById(R.id.etEditItem);
        String item = getIntent().getStringExtra("item");

        etEditItem.setText(item);
        etEditItem.setSelection(etEditItem.getText().length());

        itemPos = getIntent().getIntExtra("position", 0);
    }

    public void onSave(View view) {
        Intent item = new Intent();
        item.putExtra("item", etEditItem.getText().toString());
        item.putExtra("position", itemPos);
        setResult(RESULT_OK, item);
        finish();
    }
}
