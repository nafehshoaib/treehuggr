package io.treehugger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TreeCountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_count);
    }

    public void donate(View view)
    {

        Intent i = new Intent(TreeCountActivity.this, DonateActivity.class);
        startActivity(i);
    }
}
