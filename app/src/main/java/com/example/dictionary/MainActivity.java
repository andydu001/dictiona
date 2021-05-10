package com.example.dictionary;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.Scroller;
import android.widget.SearchView;
import android.widget.RatingBar;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private SearchView search;
    private Button btn;
    private Button clear;
    private ProgressBar bar;
    public static TextView txtv = null;
    private RatingBar rtb;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT_WATCH)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = (SearchView) findViewById(R.id.searchView);
        btn = (Button) findViewById(R.id.button);
        bar =(ProgressBar) findViewById(R.id.progressBar);
        txtv =(TextView) findViewById(R.id.textView);
        rtb = (RatingBar) findViewById(R.id.ratingBar);
        clear =(Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
            fere();
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {


                txtv.setText(null);
                 bar.setProgress(7);
            }

        });
        search.setQueryHint("Enter a word");
        btn.setBackgroundColor(Color.GREEN);
        clear.setBackgroundColor(Color.CYAN);
        search.setBackgroundColor(Color.YELLOW);
        txtv.setScrollBarSize(6);

        txtv.setScroller(new Scroller(this));


        txtv.setScrollBarSize(18);
        txtv.setTextColor(Color.BLACK);

          rtb.setNumStars(5);
          rtb.setRating(.23f);
          rtb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
              @Override
              public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

               ratingBar.setRating(rating);
 

              }
          });

    }
    public void fere()
    {
        String se =search.getQuery().toString();
        String  low =  se.toLowerCase();
        if(low.equals("free")) {
            txtv.setText(R.string.free);
        }
        else if(low.equals("business"))
        {

            txtv.setText(R.string.business);

        }
        else if(low.equals("building"))
        {

            txtv.setText(R.string.building);
        }
        else if(low.equals("canal"))
        {

            txtv.setText(R.string.canal);
        }
        else

        {
            txtv.setText(R.string.warning);
        }
    }
}