package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        RatingBar rate1 = (RatingBar)this.findViewById(R.id.ratingBar1);
        rate1.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
				Toast toast = Toast.makeText(activity, "rate: " + rating, Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    }
}
