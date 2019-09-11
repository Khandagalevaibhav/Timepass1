package com.example.timepass1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment{

    View view;
    Button FirstButtonOne;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.sim_frag_first,container,false);
        FirstButtonOne=view.findViewById(R.id.textView1);
        FirstButtonOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),Main2Activity.class);
                startActivity(intent);
                Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_SHORT).show();
            }
        });
        return view;



    }
}
