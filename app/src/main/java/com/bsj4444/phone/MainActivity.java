package com.bsj4444.phone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button call;
    private EditText numble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call=(Button)findViewById(R.id.call);
        numble=(EditText)findViewById(R.id.phoneNumber);
        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:"+numble.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
