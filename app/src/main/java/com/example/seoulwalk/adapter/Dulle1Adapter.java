package com.example.seoulwalk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.seoulwalk.R;

import java.util.ArrayList;

public class Dulle1Adapter extends RecyclerView.Adapter<Dulle1Adapter.ViewHolder> {

    private ArrayList<String> mData = null;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.dulle_item, parent,false);
        Dulle1Adapter.ViewHolder vh = new Dulle1Adapter.ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String text = mData.get(position);
        holder.textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public Dulle1Adapter(ArrayList<String> list) {
        mData = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
