package com.example.checklist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checklist.R;
import com.example.checklist.model.Componentes;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Componentes> listaComponentes;

    public Adapter(List<Componentes> lista){
        this.listaComponentes = lista;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutchecklist, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {

       Componentes componentes = listaComponentes.get(position);

       holder.item.setText(componentes.getItem());
       holder.observacao.setText(componentes.getObservacao());
       holder.ok.setChecked(false);
       holder.notOk.setChecked(false);

    }

    @Override
    public int getItemCount() {
        return listaComponentes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView item;
        TextView observacao;
        RadioGroup opcao;
        RadioButton ok;
        RadioButton notOk;

        public MyViewHolder(View itemView) {

            super(itemView);

            item         = itemView.findViewById(R.id.item);
            observacao   = itemView.findViewById(R.id.observacao);
            ok           = itemView.findViewById(R.id.checkOk);
            notOk        = itemView.findViewById(R.id.checkNotOk);
            opcao        = itemView.findViewById(R.id.opcao);
        }
    }
}
