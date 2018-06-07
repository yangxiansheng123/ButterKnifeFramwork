package com.butterknifeframwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.dongnao.butterknife_annotion.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.app_text)
      TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"绑定成功",Toast.LENGTH_LONG).show();
            }
        });
    }
}
