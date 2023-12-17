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

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {
    private ArrayList<email> lista;
    private AppCompatActivity activity;

    public EmailAdapter(ArrayList<email> lista, AppCompatActivity activity) {
        this.lista = lista;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.riga_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mittente.setText(lista.get(position).getMittente());
        holder.oggetto.setText(lista.get(position).getOggetto());
        holder.messaggio.setText(lista.get(position).getMessaggio());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView mittente;
        TextView oggetto;
        TextView messaggio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mittente = itemView.findViewById(R.id.mittente);
            oggetto = itemView.findViewById(R.id.oggetto);
            messaggio = itemView.findViewById(R.id.messaggio);
        }
    }

}
