package com.devworms.determinarpinas;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener{
    Button btn1;
    Button btn2;

    public MainActivityFragment() {
    }

    private void initControles(View view){
        this.btn1 = (Button)view.findViewById(R.id.button1);
        this.btn2 = (Button)view.findViewById(R.id.button2);
        this.btn1.setOnClickListener(this);
        this.btn2.setOnClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initControles(view);
        return view;


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(v.getContext(),"click1",Toast.LENGTH_LONG).show();
                Log.e("hola","hah");
                break;
            case R.id.button2:
                Toast.makeText(v.getContext(),"click2",Toast.LENGTH_LONG).show();
                break;

        }

    }
}
