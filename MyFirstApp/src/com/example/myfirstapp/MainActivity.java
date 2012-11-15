package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView tv=new TextView(this);
//        tv.setText();
//        setContentView(tv);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public final static String EXTRA_MESSAGE="com.example.MyFirstapp.MESSAGE";
    
    public void sendMessage(View view)
    {
    	//do something in response button
    	Intent intent=new Intent(this, DisplayMessageActivity.class);
    	EditText editText=(EditText)findViewById(R.id.edit_message);
    	String message=editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
}
