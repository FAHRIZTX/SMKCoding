package me.fahriztx.smkcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tugas1,tugas2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("INI onCreate");

        tugas1 = findViewById(R.id.btnTugas1);
        tugas2 = findViewById(R.id.btnTugas2);

        tugas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Tugas1Activity.class));
            }
        });

        tugas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Tugas2Activity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("INI onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("INI onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("INI onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("INI onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("INI onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("INI onDestroy");
    }


}
