package org.tyaa.singlefragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class DetailsActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root);
    }

    @Override
    protected Fragment createFragment() {
        return new DetailsFragment();
    }
}
