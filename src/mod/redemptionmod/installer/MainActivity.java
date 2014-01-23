package mod.redemptionmod.installer;  

import android.app.Activity;  
import android.content.Intent;  
import android.os.Bundle;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.widget.Button;  
import android.widget.TextView;
import java.io.*;  

public class MainActivity extends Activity implements  
OnClickListener{
    private Button button1 = null; 
	private Process p = null;
    public void onCreate(Bundle savedInstanceState) {  
    super.onCreate(savedInstanceState);  
    try{p = Runtime.getRuntime().exec("su");}
	catch (IOException e){}
    setContentView(R.layout.main);  
    button1 = (Button) this.findViewById(R.id.Button1);  
    button1.setOnClickListener(this);}  
	public void onClick(View v) {  
    if (v == button1) {  
    Intent intent = new Intent();  
    intent.setClass(MainActivity.this, Activity2.class);  
    MainActivity.this.startActivity(intent);  
    }}}  
