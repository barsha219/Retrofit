package com.example.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ModelViewHolder> {

    List<Model> Modellist;
    Context context;

    public ModelAdapter(Context context, List<Model> Models){
        this.context = context;
        Modellist = Models;

    }
    @NonNull
    @Override
    public ModelViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new ModelViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull  ModelAdapter.ModelViewHolder holder, int position) {
        Model model = Modellist.get(position);
        holder.userId.setText("userId : " + model.getId());
        holder.id.setText("id : " + model.getId());
        holder.title.setText("title : " + model.getTitle());
        holder.body.setText("body : " + model.getBody());


    }

    @Override
    public int getItemCount() {
        return Modellist.size();
    }

    public class ModelViewHolder extends RecyclerView.ViewHolder{

        TextView userId, id, title, body;

        public ModelViewHolder(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.userId_tv);
            id = itemView.findViewById(R.id.id_tv);
            title = itemView.findViewById(R.id.title_tv);
            body =  itemView.findViewById(R.id.body_tv);

        }
    }


}
