package com.example.administrator.httpurlconnectionexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/2/21.
 */

public class ActivityB extends AppCompatActivity{
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.look_news);
        mTextView= (TextView) findViewById(R.id.news);
        Intent intent=getIntent();
        String data=intent.getStringExtra("data");
        mTextView.setText(data);
    }
}
