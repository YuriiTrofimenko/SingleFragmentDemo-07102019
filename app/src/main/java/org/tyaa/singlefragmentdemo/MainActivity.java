package org.tyaa.singlefragmentdemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root);
    }

    @Override
    protected Fragment createFragment() {
        return new ItemsListFragment();
    }
}
