package com.example.opet.appadapteropet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AdapterSimplesActivity extends Activity {

    List<String> items;
    private Spinner spinner1;
    private ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_simples);
        items = new ArrayList<>();
        items.add("Tomate");
        items.add("Cebola");
        items.add("Alface");
        items.add("Rúcula");

        spinner1 = findViewById(R.id.spinner1);
        list1 = findViewById(R.id.list1);

        carregarSpinner();
        carregarListView();
    }

    private void carregarSpinner(){
        //Adapter -> Cria uma interface interna ao componente
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                AdapterSimplesActivity.this,
                android.R.layout.simple_dropdown_item_1line,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
    }

    private void carregarListView(){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(AdapterSimplesActivity.this,
                android.R.layout.simple_list_item_1,items);
        list1.setAdapter(adapter);
    }
}
