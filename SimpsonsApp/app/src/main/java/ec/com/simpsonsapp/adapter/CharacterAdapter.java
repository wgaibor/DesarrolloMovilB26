package ec.com.simpsonsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ec.com.simpsonsapp.R;
import ec.com.simpsonsapp.entity.CharacterEntity;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>{

    Context ctx;
    List<CharacterEntity> lstItems;

    public CharacterAdapter(Context ctx, List<CharacterEntity> characters) {
        this.ctx = ctx;
        this.lstItems = characters;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.characters_items, parent, false);
        CharacterViewHolder holder = new CharacterViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        CharacterEntity items = lstItems.get(position);
        holder.tvCharacter.setText(items.getName());
        holder.tvOccupation.setText(items.getOccupation());
        holder.tvAge.setText(String.valueOf(items.getAge()));
        holder.tvStatus.setText(items.getStatus());
        holder.tvPhrase.setText(items.getPhrases()[0]);
    }

    @Override
    public int getItemCount() {
        return lstItems.size();
    }

    class CharacterViewHolder extends RecyclerView.ViewHolder {
        ImageView imgCharacter;
        TextView tvCharacter;
        TextView tvOccupation;
        TextView tvAge;
        TextView tvStatus;
        TextView tvPhrase;

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCharacter = itemView.findViewById(R.id.img_character);
            tvCharacter = itemView.findViewById(R.id.tv_characters);
            tvOccupation = itemView.findViewById(R.id.tv_occupation);
            tvAge = itemView.findViewById(R.id.tv_age);
            tvStatus = itemView.findViewById(R.id.tv_status);
            tvPhrase = itemView.findViewById(R.id.tv_phrase);
        }
    }
}
