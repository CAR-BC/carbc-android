package Fragments.NewTransaction;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.madhushika.carbc_android_v2.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LeaseVehicle.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LeaseVehicle#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeaseVehicle extends Fragment {


    private OnFragmentInteractionListener mListener;

    public LeaseVehicle() {
        // Required empty public constructor
    }


    public static LeaseVehicle newInstance() {
        LeaseVehicle fragment = new LeaseVehicle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lease_vehicle, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
