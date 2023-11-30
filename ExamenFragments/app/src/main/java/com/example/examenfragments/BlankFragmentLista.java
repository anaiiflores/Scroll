package com.example.examenfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragmentLista#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentLista extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragmentLista() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragmentLista.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragmentLista newInstance(String param1, String param2) {
        BlankFragmentLista fragment = new BlankFragmentLista();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

   // public static BlankFragmentLista inflate(LayoutInflater layoutInflater) {
   // }
    TextView entreno1;
    TextView entreno2;
    TextView entreno3;
    TextView entreno4;


    ArrayList<Entrenos> fragmentsEntrenos;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

       // TextView text = findViewById(R.id.textView1);
        //TextView text2 = findViewById(R.id.textView2);
        //TextView text3 = findViewById(R.id.textView3);
        //TextView text4 = findViewById(R.id.textView4);
        text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        text2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


        text3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        text4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }

    //...







    class Adaptadorr extends ArrayAdapter<Entrenos> {

        AppCompatActivity appCompatActivity;

        Adaptadorr(AppCompatActivity context) {
            super(context, R.layout.fragment_blank_entrenos, fragmentsEntrenos);
            appCompatActivity = context;
        }


        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.fragment_blank_entrenos, null);

            TextView textView1 = item.findViewById(R.id.textView1);
            textView1.setText(fragmentsEntrenos.get(position).getNombre());

            ImageView imageView1 = item.findViewById(R.id.imageView1);

            return item;
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View cal = inflater.inflate(R.layout.fragment_blank_entrenos, container, false);
        TextView cambiar = cal.findViewById(R.id.listaNueva);
        cambiar.setOnClickListener(View );

        return inflater.inflate(R.layout.fragment_blank_entrenos, container, false);
    }
}





