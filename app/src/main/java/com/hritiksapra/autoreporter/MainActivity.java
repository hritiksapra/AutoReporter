package com.hritiksapra.autoreporter;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText1,editText2,editText3,editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        editText=(EditText) findViewById(R.id.editText);
        editText1=(EditText) findViewById(R.id.editText2);
        editText2=(EditText) findViewById(R.id.editText3);
        editText3=(EditText) findViewById(R.id.editText4);
        editText4=(EditText) findViewById(R.id.editText5);

        String message= "I am "+ editText.getText().toString()+"My Number is: "+editText1.getText().toString()+" My Email is: "+editText2.getText().toString()+" The auto I would like to complain about has a license plate of "+editText3.getText().toString()+ " and my complaint is: "+editText4.getText().toString();
        Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( "sms:" + "9971147072"));
        intent.putExtra( "sms_body", message );
        startActivity(intent);
    }
}
