package mod.redemptionmod.installer;

import android.app.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import java.io.*;
import android.content.res.*;
import android.content.*;

public class Activity2 extends Activity{

	private TextView v;
	private String g;
	private String[] s;
	private Process p = null;

	@Override

    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
		v = (TextView)findViewById(R.id.hello);
		final Button b = (Button)findViewById(R.id.button);
		g = "/data/red/";
		String f = "/mnt/sdcard/red/";
		File e = new File(f);
		if(!e.exists()){
			e.mkdir();
		}
		AssetManager a = getAssets();
		try{
			p = Runtime.getRuntime().exec("su");
			s = a.list("");
			if(!(new File(g).exists())){
				Runtime.getRuntime().exec("su -c mkdir /data/red/");
			}
		}
		catch (IOException l){

		}

		for(int i = 0;i < s.length;i++){
			if(s[i].endsWith(".sh")){
				out(a,g,s,i);
			}
			sdcard(a,s,i,new File(f+s[i]));
		}
		v.append("\n\n\n\n\n\n\n\n\n---READY TO GO---\n\n\n\n\n");
		b.setOnClickListener(new Button.OnClickListener(){				
				public void onClick(View p1){
					for(int i = 0;i < 2;i++){
						if(s[i].endsWith(".sh")){
							start(i);
							Intent intent = new Intent();  
							intent.setClass(Activity2.this, Activity3.class);  

							Activity2.this.startActivity(intent);  
						
								

							
						}
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
						}
					}
				});
			};
    
	private void out(AssetManager a,String g,String[] s,int i){
		InputStream in = null;
		FileOutputStream out = null;
		File f = new File(g+s[i]);
		if(!f.exists()){
			try{
				Runtime.getRuntime().exec("su -c chmod 777 /data/red");
				in = a.open(s[i]);
				out = new FileOutputStream(f);
				byte[] b = new byte[1024];
				int t;
				while((t = in.read(b)) != -1){
					out.write(b,0,t);
				}
				in.close();
				out.flush();
				out.close();
				if(s[i].endsWith(".sh")){
					try{
						Runtime.getRuntime().exec("chmod 777 " + g + s[i]);
					}
					catch (IOException e){}
				}
			}catch(Exception o){
				out(a,g,s,i);
			}
		}
	}
	private void start(int i){
		try{
			DataOutputStream out = new DataOutputStream(p.getOutputStream());
			out.writeBytes(g+s[i]);
			out.flush();
			out.close();
		}
		catch (IOException e){
			start(i);
		}
	}
	private void sdcard(AssetManager a,String[] s,int i,File f){
		InputStream in = null;
		FileOutputStream out = null;
		int t = 0;
		try{
			in = a.open(s[i]);
			out = new FileOutputStream(f);
			byte[] p = new byte[1024];
			while((t = in.read(p)) != -1){
				out.write(p,0,t);
			}
			in.close();
			out.flush();
			out.close();
		}
		catch (IOException o){
		}
	}

	




          
      

}  
