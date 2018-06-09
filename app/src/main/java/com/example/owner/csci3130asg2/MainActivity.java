package com.example.owner.csci3130asg2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText inputText = (EditText)findViewById(R.id.inputText);
        final TextView textOut = (TextView)findViewById(R.id.passwordStrength);

        final Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Validator pretzels = new Validator();
                int error = pretzels.validation(inputText.getText().toString());
                if (error == 0){
                    textOut.setText("Password Acceptable");
                }
                else{
                    textOut.setText("Password is weak");
                }

            }
        });
    }

}
