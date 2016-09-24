package com.minorproject.ckaa.travelbuddy;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ckaa on 8/16/2015.
 */



public class Hotel extends android.support.v4.app.Fragment {

    Button b;

    public Hotel() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


  /*  public class TBRatingBar extends Activity implements
            RatingBar.OnCreateContextMenuListener {
        //RatingBar getRatingBar;
         RatingBar setRatingBar;
        RatingBar setRatingBar5;
        //TextView countText;
        //int count;
        //float curRate;

        /**
         * Called when the activity is first created.
         */
    /*    @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            findViewsById();

            //setRatingBar.setRating(curRate);
            //setOnRatingBarChangeListener();
        }

        { private void findViewsById() {
            // getRatingBar = (RatingBar) findViewById(R.id.getRating);
            setRatingBar = (RatingBar) findViewById(R.id.setRating);
            setRatingBar = (RatingBar) findViewById(R.id.setRating1);
            // countText = (TextView) findViewById(R.id.countText);
        }}
        private void findViewsById() {
            // getRatingBar = (RatingBar) findViewById(R.id.getRating);
            setRatingBar = (RatingBar) findViewById(R.id.setRating);
            setRatingBar = (RatingBar) findViewById(R.id.setRating1);

      /*  public void onRatingChanged(RatingBar rateBar, float rating,
                                    boolean fromUser) {
            //DecimalFormat decimalFormat = new DecimalFormat("#.#");
            //curRate = Float.valueOf(decimalFormat.format((curRate * count + rating)
            //     / ++count));
            Toast.makeText(TBRatingBar.this,
                    "New Rating: " + rating, Toast.LENGTH_SHORT).show();
            setRatingBar.setRating(rating);
            //countText.setText(count + " Ratings");
        }
    }*/

}
