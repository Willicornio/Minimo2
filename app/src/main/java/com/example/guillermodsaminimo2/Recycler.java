package com.example.guillermodsaminimo2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
public class Recycler extends RecyclerView.Adapter<Recycler.ViewHolder> {


    private Context context;

    public Recycler(Context context) {
        this.lista = new ArrayList<>();
        this.context = context;
    }

    private List<Element> lista;

    public void rellenarLista(List<Element> todoselementos){
        lista.addAll(todoselementos);
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.museoitem, null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Element element = lista.get(i);
        Picasso.with(context).load(element.getImatge().get(0)).into(viewHolder.imagenMuseoView);
        viewHolder.nombremuseo.setText(element.getAdrecaNom());

    }

    @Override
    public int getItemCount() {

        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ConstraintLayout constraintLayout; //esto no se usa, pero el Vera sabrá más que tu, payaso
        private TextView nombremuseo;
        private ImageView imagenMuseoView;

        public ViewHolder(View v){
            super(v);
            constraintLayout = v.findViewById(R.id.constraintLayout); //Esto es el id del ConstraitLayout que hay que ponerlo donde "ConstariLayout" ID"
            nombremuseo = v.findViewById(R.id.nombremuseo);
            imagenMuseoView = v.findViewById(R.id.imagenmuseo);

        }


    }

}
