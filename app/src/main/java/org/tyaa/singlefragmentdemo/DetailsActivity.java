package org.tyaa.singlefragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class DetailsActivity extends SingleFragmentActivity {

    public static final String EXTRA_ITEM_TEXT = "com.tyaa.itsteplistfragments.item_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root);
    }

    @Override
    protected Fragment createFragment() {
        // Активити получает данные из интента - это свойственная ей обязанность
        String itemTextString =
                (String)getIntent().getSerializableExtra(DetailsActivity.EXTRA_ITEM_TEXT);
        //... и передает эти данные своему фрагменту при его создании
        //статическим методом DetailsFragment.newInstance
        return DetailsFragment.newInstance(itemTextString);
    }
}
