package com.srnaxter.pokeapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.hannesdorfmann.swipeback.Position;
import com.hannesdorfmann.swipeback.SwipeBack;

/**
 * Created by srnaxter on 16/03/2018.
 */

public class BulbasaurActivity extends FragmentActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulbasaur);
        SwipeBack.attach(this, Position.LEFT)
                .setContentView(R.layout.activity_bulbasaur)
                .setSwipeBackView(R.layout.swipeback_default);

    }


    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.swipeback_stack_to_front,
                R.anim.swipeback_stack_right_out);
    }
}
