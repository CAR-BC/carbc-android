package Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.madhushika.carbc_android_v2.R;

import Fragments.NewTransaction.BuyVehicle;
import Fragments.NewTransaction.EmissionTesting;
import Fragments.NewTransaction.InsureVehicle;
import Fragments.NewTransaction.LeaseVehicle;
import Fragments.NewTransaction.LeasingPayment;
import Fragments.NewTransaction.RegRegisteredVehicle;
import Fragments.NewTransaction.SellVehicle;


public class Transaction_Registered extends Fragment {


    private OnFragmentInteractionListener mListener;

    public Transaction_Registered() {
        // Required empty public constructor
    }


    public static Transaction_Registered newInstance() {
        Transaction_Registered fragment = new Transaction_Registered();

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

        View view =inflater.inflate(R.layout.fragment_transaction__registered, container, false);

        GridLayout gridView = (GridLayout)view.findViewById(R.id.grid);
        CardView buyVehicle =(CardView) view.findViewById(R.id.tr_buy_vehicle);
        CardView sellVehicle =(CardView) view.findViewById(R.id.tr_sell_vehicle2);
        CardView serviceVehicle =(CardView) view.findViewById(R.id.tr_service_vehicle);
        CardView regVehicle =(CardView) view.findViewById(R.id.tr_reg_new_vehicle);
        CardView insureVehicle =(CardView) view.findViewById(R.id.tr_insure_vehicle);
        CardView leaseVehicle =(CardView) view.findViewById(R.id.tr_leasing_vehicle);
        CardView leasePayVehicle =(CardView) view.findViewById(R.id.tr_leasing_payment_vehicle);
        CardView emissionVehicle =(CardView) view.findViewById(R.id.tr_emision_vehicle);

        ImageView backBtn = (ImageView) view.findViewById(R.id.tr_back_button);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 getFragmentManager().popBackStack();
            }
        });
        buyVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, BuyVehicle.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });
        sellVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, SellVehicle.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });
        serviceVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, Service_and_repair_running_repair.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });

        regVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, RegRegisteredVehicle.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });

        insureVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, InsureVehicle.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });

        leaseVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, LeaseVehicle.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });

        leasePayVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, LeasingPayment.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });

        emissionVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, EmissionTesting.newInstance()).addToBackStack(null);
                transaction.commit();
            }
        });
        return view;
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
