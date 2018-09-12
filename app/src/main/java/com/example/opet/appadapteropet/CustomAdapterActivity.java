package com.example.opet.appadapteropet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends Activity {

    private ListView list2;
    private List<Produto> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        list2 = findViewById(R.id.list2);
        produtos = new ArrayList<>();
        produtos.add(new Produto("PS4", 2200.00, 15));
        produtos.add(new Produto("PC Monstrão", 8500.00, 4));
        produtos.add(new Produto("Spider-man", 200.00, 40));

        carregarProdutos();
    }

    private void carregarProdutos(){
        ArrayAdapter<Produto> adapter = new ProdutoAdapter(CustomAdapterActivity.this,
                R.layout.produto_item,produtos);
        list2.setAdapter(adapter);
    }
}
