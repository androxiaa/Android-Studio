package it.unich.s3221238.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import it.unich.s3221238.recyclerview.adapter.Insegnamenti;
import it.unich.s3221238.recyclerview.adapter.PianoStudiAdapter;

public class PianoStudioActivity extends AppCompatActivity {

        RecyclerView recyclerView;
        LayoutManager layoutManager;

        ArrayList<Insegnamenti> pianoStudi;
        PianoStudiAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_studio);

        Insegnamenti i1 = new Insegnamenti("Sistemi Mobili", "Scozzari", 6);
        Insegnamenti i2 = new Insegnamenti("Programmazione Web", "Fioravanti", 6);
        Insegnamenti i3 = new Insegnamenti("Ragioneria ", "Rea", 6);
        pianoStudi.add(i1);
        pianoStudi.add(i2);
        pianoStudi.add(i3);

        recyclerView = findViewById(R.id.rec_piani);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new PianoStudiAdapter(pianoStudi, this);
        recyclerView.setAdapter(adapter);
    }
}