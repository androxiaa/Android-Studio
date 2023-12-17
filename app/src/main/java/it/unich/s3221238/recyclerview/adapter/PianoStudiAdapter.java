package it.unich.s3221238.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import it.unich.s3221238.recyclerview.R;

public class PianoStudiAdapter   extends RecyclerView.Adapter<PianoStudiAdapter.ViewHolder> {
    private ArrayList<Insegnamenti> lista;
    private AppCompatActivity activity;

    public PianoStudiAdapter(ArrayList<Insegnamenti> lista, AppCompatActivity activity) {
        this.lista = lista;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PianoStudiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.riga_piano_studi,parent, false);
        return new PianoStudiAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PianoStudiAdapter.ViewHolder holder, int position) {
        holder.nome.setText(lista.get(position).getNome());
        holder.docente.setText(lista.get(position).getDocente());
        holder.cfu.setText("CFU:" +lista.get(position).getCfu());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nome;
        TextView docente;
        TextView cfu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.nome);
            docente = itemView.findViewById(R.id.docente);
            cfu = itemView.findViewById(R.id.cfu);
        }
    }
}
