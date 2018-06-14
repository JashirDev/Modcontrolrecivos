package com.example.gamer.modcontrolrecibo.Adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gamer.modcontrolrecibo.Modelo.Persona;
import com.example.gamer.modcontrolrecibo.R;

import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolderPersona> {
    ArrayList<Persona>listapersona;

    public PersonaAdapter(ArrayList<Persona> listapersona) {
        this.listapersona = listapersona;
    }

    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_persona,parent,false);


        return new ViewHolderPersona(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int position) {

        holder.cvnombre.setText(listapersona.get(position).getNombre());
        holder.cvconcepto.setText(listapersona.get(position).getConcepto());
        holder.cvcodigo.setText(listapersona.get(position).getCodigo());
        holder.cvrecivo.setText(String.valueOf(listapersona.get(position).getImporte()));
        holder.cvfecha.setText(listapersona.get(position).getFecha());


    }

    @Override
    public int getItemCount() {
        return listapersona.size();
    }

    public class ViewHolderPersona extends RecyclerView.ViewHolder {
        TextView cvnombre,cvconcepto,cvcodigo,cvrecivo,cvfecha;
        public ViewHolderPersona(View itemView) {
            super(itemView);
            cvnombre=itemView.findViewById(R.id.cv_nombre);
            cvconcepto=itemView.findViewById(R.id.cv_concepto);
            cvcodigo=itemView.findViewById(R.id.cv_codigo);
            cvrecivo=itemView.findViewById(R.id.cv_recibo);
            cvfecha=itemView.findViewById(R.id.cv_fecha);
        }
    }
}
