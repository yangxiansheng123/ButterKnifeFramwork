package com.butterknifeframwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.dongnao.butterknife_annotion.BindView;

public class SconctActivity2 extends AppCompatActivity {
    @BindView(R.id.app_text)
    public  TextView textView;

//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
