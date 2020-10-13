package com.example.eziam;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<UserHelperClass> users;

    public MyAdapter(Context context, ArrayList<UserHelperClass> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.visitorName.setText(users.get(position).getName());
        holder.idNumber.setText(users.get(position).getIdNo());
        holder.phoneNumber.setText(users.get(position).getPhoneNo());
        holder.tenantName.setText(users.get(position).getTenantN());
        holder.houseNumber.setText(users.get(position).getHouseNo());
        holder.timeIn.setText(users.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView visitorName, idNumber, phoneNumber, tenantName, houseNumber, timeIn;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            visitorName = itemView.findViewById(R.id.v_name);
            idNumber = itemView.findViewById(R.id.id_no);
            phoneNumber = itemView.findViewById(R.id.phone_no);
            tenantName = itemView.findViewById(R.id.t_name);
            houseNumber = itemView.findViewById(R.id.h_no);
            timeIn = itemView.findViewById(R.id.t_in);
        }
    }
}
