package com.example.practice;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	TextView tv,tv1;
	EditText edt,edt1;
	Button btn,btn1;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        tv=(TextView)findViewById(R.id.textView1);
	        tv1=(TextView)findViewById(R.id.textView2);
	        edt=(EditText)findViewById(R.id.editText1);
	        edt1=(EditText)findViewById(R.id.editText2);
	        btn=(Button)findViewById(R.id.button1);
	        btn1=(Button)findViewById(R.id.button2);
	        btn.setOnClickListener(this);
	        btn1.setOnClickListener(this);
	        }

	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.activity_main, menu);
	        return true;
	    }
	    public String generateString( String characters, int length)
		{ Random r=new Random();
	    	
		    char[] text = new char[length];
		    for (int i = 0; i < length; i++)
		    {
		        text[i] = characters.charAt(r.nextInt(characters.length()));
		    }
		    return new String(text);
		}

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String str,st;
			str=edt.getText().toString();
			str=generateString(str, str.length());
			tv.setText(str);
			st=edt1.getText().toString();
			tv1.setText(st);
		}
	    
	}

