package Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.madhushika.carbc_android_v2.R;

import Objects.PendingBlock;


public class My_history_status extends Fragment {

    private OnFragmentInteractionListener mListener;

    public My_history_status() {
        // Required empty public constructor
    }

    public static My_history_status newInstance() {
        My_history_status fragment = new My_history_status();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my_history_status, container, false);

        ListView confirm_transacion_list =(ListView)view.findViewById(R.id.my_history_status_list);


        PendingBlock b = new PendingBlock("vid","desc","today");
        final PendingBlock[] pendingBlocks = new PendingBlock[1]; //Should create list of my b
        pendingBlocks[1] = b;
        // should add db helper

        confirm_transacion_list.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return pendingBlocks.length;
            }

            @Override
            public Object getItem(int position) {
                return pendingBlocks[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                PendingBlock pendingBlock = pendingBlocks[position];
                View cellUser = null;

                if (convertView == null){

                    cellUser = inflater.inflate(R.layout.cell_my_vehicle_status, parent, false);

                }

                else {
                    cellUser = convertView;
                }

                My_history_status.Placeholder ph = (My_history_status.Placeholder) cellUser.getTag();
                TextView condition;
                TextView vehicle_description;
                TextView init_date;

                if (ph == null) {
                    vehicle_description = (TextView) cellUser.findViewById(R.id.cell_my_vehicle_status_event);
                    init_date = (TextView) cellUser.findViewById(R.id.cell_my_vehicle_status_date);
                    condition = (TextView) cellUser.findViewById(R.id.cell_my_vehicle_status_condition);


                    ph = new Placeholder();
                    ph.vehicle_description = vehicle_description;
                    ph.initiate_date = init_date;
                    ph.condition = condition;

                    cellUser.setTag(ph);
                } else {
                    vehicle_description = ph.vehicle_description;
                    init_date = ph.initiate_date;
                    condition = ph.condition;
                }

                //should changed
                condition.setText(pendingBlock.getVid());
                vehicle_description.setText(pendingBlock.getDescr());
                init_date.setText(pendingBlock.getInit_date());

                return cellUser;
            }
        });

        // Inflate the layout for this fragment
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

    private class Placeholder {
        public TextView vehicle_description;
        public TextView initiate_date;
        public TextView condition;
    }
}
