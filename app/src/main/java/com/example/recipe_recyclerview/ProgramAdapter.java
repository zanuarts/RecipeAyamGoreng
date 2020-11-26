package com.example.recipe_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    String[] bahanMasak;
    String[] langkahMasak;
    String[] descLangkah;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rowName;
//        TextView rowDesc;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            rowName = itemView.findViewById(R.id.textView1);
//            rowDesc = itemView.findViewById(R.id.textView2);

        }
    }

    public ProgramAdapter(Context context, String[] bahanMasak, String[] langkahMasak, String[] descLangkah){
        this.context = context;
        this.bahanMasak = bahanMasak;
        this.langkahMasak = langkahMasak;
        this.descLangkah = descLangkah;
    }

    @NonNull
    @Override
    public ProgramAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramAdapter.ViewHolder holder, int position) {
        holder.rowName.setText(bahanMasak[position]);
//        holder.rowDesc.setText(langkahMasak[position]);
    }

    @Override
    public int getItemCount() {
        return bahanMasak.length;
    }
}
