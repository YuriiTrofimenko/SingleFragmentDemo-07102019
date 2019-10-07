package org.tyaa.singlefragmentdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DetailsFragment extends Fragment {

    public static final String EXTRA_ITEM_TEXT = "com.tyaa.itsteplistfragments.item_text";
    private String mItemTextString = "";
    private TextView mSecondActivityTextView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mItemTextString =
                (String)getActivity().getIntent().getSerializableExtra(EXTRA_ITEM_TEXT);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        mSecondActivityTextView = (TextView)view.findViewById(R.id.second_activity_TextView);
        mSecondActivityTextView.setText(mItemTextString);
        return view;
    }
}
