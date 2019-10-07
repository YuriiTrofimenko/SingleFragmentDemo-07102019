package org.tyaa.singlefragmentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class ItemsListFragment extends ListFragment {

    private ArrayList<NewsItem> mItems;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mItems = new ArrayList<NewsItem>();

        mItems.add(new NewsItem("title1", "content1", "author1", new Date()));

        NewsAdapter itemsAdapter = new NewsAdapter(mItems);
        setListAdapter(itemsAdapter);

        mItems.add(new NewsItem("title2", "content2", "author2", new Date()));
        mItems.add(new NewsItem("title3", "content3", "author3", new Date()));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent startDetailsActivityIntent = new Intent(getActivity(), DetailsActivity.class);
        startDetailsActivityIntent.putExtra(DetailsActivity.EXTRA_ITEM_TEXT, mItems.get(position).id);
        startActivity(startDetailsActivityIntent);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_items_list, container, false);
        return view;
    }

    private class NewsAdapter extends ArrayAdapter<NewsItem> {
        public NewsAdapter(ArrayList<NewsItem> newsItem) {
            super(getActivity(), 0, newsItem);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item, null);
            }
            NewsItem newsItem = getItem(position);

            TextView titleTextView = convertView.findViewById(R.id.newsTitle);
            titleTextView.setText(newsItem.title);

            TextView contentTextView = convertView.findViewById(R.id.newsContent);
            contentTextView.setText(newsItem.content);

            Log.e("NewsItem Id", newsItem.id.toString());

            return convertView;
        }
    }

}
