package dk.aau.mppss.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "onCreate() has been executed");
        Log.d("MPPS2015", "Hej LogCat");

        setContentView(R.layout.activity_main);
        final TextView firstTextView=(TextView)findViewById(R.id.firstTextView);
        final EditText editText = (EditText)findViewById(R.id.editText);
        Button okBtn = (Button)findViewById(R.id.okBtn);
        Button showBtn = (Button)findViewById(R.id.ShowBtn);

        firstTextView.setText("Hello");
        editText.setText("Something else...");
        String text=editText.getText().toString();

        okBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textINET=editText.getText().toString();
                firstTextView.setText(textINET);
            }

        });

        showBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_LONG).show();
            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStart() was executed - from override");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("MainActivity", "onResume() was executed - from override");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("MainActivity", "onPause() was executed - from override");

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("MainActivity", "onStop() was executed - from override");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("MainActivity", "onDestroy() was executed - from override");

    }
}
