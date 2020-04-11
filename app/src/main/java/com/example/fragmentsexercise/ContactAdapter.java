package com.example.fragmentsexercise;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private List<Contact> contacts;

    public ContactAdapter(List<Contact> contacts){
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.contact_preview, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Contact contact = contacts.get(position);

        ImageView avatar = holder.avatar;
        avatar.setImageResource(contact.getImageID());
        TextView name = holder.name;
        name.setText(contact.getName());
        TextView address = holder.address;
        address.setText(contact.getAddress());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView avatar;
        public TextView name;
        public TextView address;

        public ViewHolder(View itemView){
            super(itemView);

            avatar = itemView.findViewById(R.id.avatar);
            name = itemView.findViewById(R.id.name);
            address = itemView.findViewById(R.id.contactAddress);
        }
    }
}
