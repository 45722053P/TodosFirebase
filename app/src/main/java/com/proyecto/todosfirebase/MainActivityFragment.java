package com.proyecto.todosfirebase;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ListView listaTodo;
    EditText mensaje;
    Button btnEnviar;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewFragment = inflater.inflate(R.layout.fragment_main, container, false);


        listaTodo = (ListView) viewFragment.findViewById(R.id.listView);
        mensaje = (EditText) viewFragment.findViewById(R.id.notaEnviar);
        btnEnviar = (Button) viewFragment.findViewById(R.id.btn_Enviar);




        return viewFragment;
    }
}
