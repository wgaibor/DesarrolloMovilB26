package ec.com.simpsonsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ec.com.simpsonsapp.adapter.CharacterAdapter;
import ec.com.simpsonsapp.entity.CharacterEntity;

public class MainActivity extends AppCompatActivity {

    CharacterAdapter adapter;

    RecyclerView rvCharacters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCharacters = findViewById(R.id.rv_characters);
        fillCharacters();
    }

    private void fillCharacters() {
        List<CharacterEntity> characters = new ArrayList<>();
        CharacterEntity item = new CharacterEntity();
        item.setName("Homer Simpson");
        item.setOccupation("Profesor de Historia");
        item.setAge(40);
        item.setStatus("Vivo");
        item.setPhrases(new String[]{"Frase celebre"});
        characters.add(item);

        item = new CharacterEntity();
        item.setName("Marge Simpson");
        item.setOccupation("Abogada");
        item.setAge(38);
        item.setStatus("Vivo");
        item.setPhrases(new String[]{"Frase celebre"});
        characters.add(item);

        item = new CharacterEntity();
        item.setName("Bart Simpson");
        item.setOccupation("Estudiante");
        item.setAge(10);
        item.setStatus("Vivo");
        item.setPhrases(new String[]{"Frase celebre"});
        characters.add(item);

        adapter = new CharacterAdapter(this, characters);
        rvCharacters.setAdapter(adapter);
        //rvCharacters.setHasFixedSize(false);
        rvCharacters.setLayoutManager(new LinearLayoutManager(this));
    }
}