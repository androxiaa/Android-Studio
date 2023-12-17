package it.unich.s3221238.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import it.unich.s3221238.recyclerview.adapter.EmailAdapter;
import it.unich.s3221238.recyclerview.adapter.email;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ArrayList<email> lista;
    EmailAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ArrayList<email>();
        email e1 = new email("Mario Rossi","Richiesta appuntamento","Ciao, vengo domani");
        email e2 = new email("Mario Verdi","Richiesta addio","Ciao,non vengo domani");
        email e3 = new email("Mario Bianchi","Richiesta visita","Ciao, vengo");
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);

        recyclerView =findViewById(R.id.rec_view);
        layoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new EmailAdapter(lista, this);
        recyclerView.setAdapter(adapter);
    }
}