package xin.mao.maoxin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"你好",Toast.LENGTH_SHORT).show();
                Intent intet=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intet);
                //TODO codeis
            }
        });
    }
    Gson gson=new Gson();

}
