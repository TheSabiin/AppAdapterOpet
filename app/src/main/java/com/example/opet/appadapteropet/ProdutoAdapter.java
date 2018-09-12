package com.example.opet.appadapteropet;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by opet on 12/09/2018.
 */

public class ProdutoAdapter extends ArrayAdapter<Produto> {

    private int rId;

    public ProdutoAdapter (Context context, int resource, List<Produto> objects) {
        super(context, resource, objects);
        rId = resource;
    }
    @Override
    public View getView(int position, View mView, ViewGroup parent){
        View view = mView;

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(rId, null);
        }

        TextView textNome = view.findViewById(R.id.textNomeProduto);
        TextView textValor = view.findViewById(R.id.textValorProduto);
        TextView textQtde = view.findViewById(R.id.textValorProduto);

        Produto prod = getItem(position);

        textNome.setText(prod.getNome());
        textValor.setText(String.valueOf(prod.getValor()));

        if(prod.getEstoque() < 10)
            textQtde.setTextColor(Color.RED);
        else
            textQtde.setTextColor(Color.BLUE);
        textQtde.setText(String.valueOf(prod.getEstoque()));

        return view;
    }
}
