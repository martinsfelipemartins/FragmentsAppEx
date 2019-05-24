package br.com.cursostudio.fragmentsappex;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento1 extends Fragment {


    public Fragmento1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragmento1, container, false);
        // Inflate the layout for this fragment
        Button buttonRed = view.findViewById(R.id.btnRed);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;


    }


}
