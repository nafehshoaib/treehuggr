package io.treehugger;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setBackgroundColor(Color.WHITE);
    }

    public void register(View view)
    {

        Intent i = new Intent(MainActivity.this, RegisterActivity.class);
        startActivity(i);
    }


    public void treecount(View view)
    {

        Intent i = new Intent(MainActivity.this, TreeCountActivity.class);
        startActivity(i);
    }

}
