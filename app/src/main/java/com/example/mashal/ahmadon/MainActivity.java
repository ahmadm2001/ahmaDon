package com.example.mashal.ahmadon;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText x,e,r;
    TextView a;
    Button p;
    int w,y,z;
    WebView u;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x=(EditText) findViewById(R.id.editText4);
        e=(EditText) findViewById(R.id.editText5);
        r=(EditText) findViewById(R.id.editText6);
        p=(Button) findViewById(R.id.button5);
        a=(TextView) findViewById(R.id.textView);
        u=(WebView) findViewById(R.id.shked);
    }

    public void ahm (View view){
        String st=x.getText().toString();
        String st1=e.getText().toString();
        String st2=r.getText().toString();
        w=Integer.parseInt(st);//A
        y=Integer.parseInt(st1);//B
        z=Integer.parseInt(st2);//C
        a.setText(w+"x^2+"+y+"x"+z);
        u.getSettings().setJavaScriptEnabled(true);
        String url="https://www.google.co.il/search?hl=iw&source=hp&ei=KbGAWsLZII-VsAfun5f4Bw&q=";
        url=url+w+"x%5E2%2B"+y+"x%2B"+z;
        u.loadUrl(url);

    }
}
