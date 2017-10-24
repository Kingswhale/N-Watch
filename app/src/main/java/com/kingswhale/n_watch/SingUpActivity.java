package com.kingswhale.n_watch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * A login screen that offers sign up via required details.
 */
public class SingUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
    }

    public void location (View view){
        Intent googleMap = new Intent(this, GoogleActivity.class);
        startActivity(googleMap);
    }
}
