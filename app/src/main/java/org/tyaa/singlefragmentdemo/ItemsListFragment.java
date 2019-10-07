package org.tyaa.singlefragmentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ItemsListFragment extends ListFragment {

    private ArrayList<String> mItems;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mItems = new ArrayList<String>();

        mItems.add("One");

        ItemsAdapter itemsAdapter = new ItemsAdapter(mItems);
        setListAdapter(itemsAdapter);

        mItems.add("Two");
        mItems.add("Three");
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent startDetailsActivityIntent = new Intent(getActivity(), DetailsActivity.class);
        startDetailsActivityIntent.putExtra(DetailsActivity.EXTRA_ITEM_TEXT, mItems.get(position));
        startActivity(startDetailsActivityIntent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items_list, container, false);
        return view;
    }

    private class ItemsAdapter extends ArrayAdapter<String> {
        public ItemsAdapter(ArrayList<String> items) {
            super(getActivity(), android.R.layout.simple_list_item_1, items);
        }
    }
}
