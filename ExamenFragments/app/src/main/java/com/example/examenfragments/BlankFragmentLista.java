package com.example.examenfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class BlankFragmentLista extends Fragment {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;

    public BlankFragmentLista() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank_entrenos, container, false);

        LinearLayout layout = view.findViewById(R.id.layout);
        textView1 = layout.findViewById(R.id.textView1);
        textView2 = layout.findViewById(R.id.textView2);
        textView3 = layout.findViewById(R.id.textView3);
        textView4 = layout.findViewById(R.id.textView4);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment nextFragment = BlankFragmentEntrenos.newInstance();
                performFragmentTransaction(nextFragment);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment anotherFragment = BlankFragmentEntreno2.newInstance();
                performFragmentTransaction(anotherFragment);
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment anotherFragment = BlankFragmentEntreno3.newInstance();
                performFragmentTransaction(anotherFragment);
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment anotherFragment = BlankFragmentEntreno4.newInstance();
                performFragmentTransaction(anotherFragment);
            }
        });

        return view;
    }

    private void performFragmentTransaction(Fragment fragment) {
        if (getActivity() != null) {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentContainerView, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }

}
