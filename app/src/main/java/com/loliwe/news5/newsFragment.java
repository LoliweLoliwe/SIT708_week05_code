package com.loliwe.news5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link newsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class newsFragment extends Fragment {

    private RecyclerView recyclerView;
    ArrayList<dataModel> newsStories;
    willBeAdapter willBeAdapter;
    FloatingActionButton floatingAcBtn;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public newsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment newsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static newsFragment newInstance(String param1, String param2) {
        newsFragment fragment = new newsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_news, container, false);

        floatingAcBtn = (FloatingActionButton) rootView.findViewById(R.id.floatingBtn);

        recyclerView =  (RecyclerView) rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));


        newsStories = new ArrayList<>();
        newsStories.add(new dataModel("War in Ukraine", "Many civilians are trapped for weeks underground in the besieged Azovstal steel plant in Mairupol...",R.drawable.oipx1));
        newsStories.add(new dataModel("Eskom Powercuts", "Many civilians are trapped for weeks underground in the besieged Azovstal steel plant in Mairupol...",R.drawable.oipx2));
        newsStories.add(new dataModel("More protests in Paris", "Many civilians are trapped for weeks underground in the besieged Azovstal steel plant in Mairupol...",R.drawable.oipx3));
        newsStories.add(new dataModel("Drugs found at sea", "Many civilians are trapped for weeks underground in the besieged Azovstal steel plant in Mairupol...",R.drawable.oipx4));
        newsStories.add(new dataModel("Facebook rapist re-arrested", "Many civilians are trapped for weeks underground in the besieged Azovstal steel plant in Mairupol...",R.drawable.oip6));

        willBeAdapter = new willBeAdapter(this, newsStories);
        recyclerView.setAdapter(willBeAdapter);

        //recyclerView.setItemAnimator(new DefaultItemAnimator());

        floatingAcBtn.setOnClickListener(v -> newsStories.add(new dataModel("type a title", "News story goes here....",R.drawable.oip5)));

        return rootView;
    }
}