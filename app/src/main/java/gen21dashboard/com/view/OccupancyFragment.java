package gen21dashboard.com.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gen21dashboard.com.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OccupancyFragment extends Fragment {


    public OccupancyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_occupancy, container, false);

        return v;
    }

}
