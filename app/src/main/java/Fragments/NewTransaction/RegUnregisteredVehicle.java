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
 * {@link RegUnregisteredVehicle.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RegUnregisteredVehicle#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegUnregisteredVehicle extends Fragment {

    private OnFragmentInteractionListener mListener;

    public RegUnregisteredVehicle() {
        // Required empty public constructor
    }

    public static RegUnregisteredVehicle newInstance() {
        RegUnregisteredVehicle fragment = new RegUnregisteredVehicle();

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
        return inflater.inflate(R.layout.fragment_reg_unregistered_vehicle, container, false);
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
