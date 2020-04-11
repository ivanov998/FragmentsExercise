package com.example.fragmentsexercise;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ContactFragment extends DialogFragment implements View.OnClickListener {

    private EditText name;
    private EditText address;
    private Button btn;

    private NewContact listener;

    public static ContactFragment newInstance(){
        return new ContactFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name = view.findViewById(R.id.name);
        address = view.findViewById(R.id.address);
        btn = view.findViewById(R.id.send);

        btn.setOnClickListener(this);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (NewContact) context;
    }

    @Override
    public void onClick(View v) {
        int imgID = R.drawable.ic_launcher_background;
        String contactName = name.getText().toString();
        String contactAddress = address.getText().toString();

        Contact contact = new Contact(contactName, contactAddress, imgID);

        listener.addNewContact(contact);
        dismiss();
    }
}
