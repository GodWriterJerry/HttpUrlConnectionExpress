package com.example.administrator.httpurlconnectionexpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText1,mEditText2;
    private Button mButton;
    private TextView mTextView;
    private ListView mListView;
    private static final String TAG = "MainActivity";
    ArrayList<String> datas=new ArrayList<String>();
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayAdapter<String> mAdapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String com=mEditText1.getText().toString().trim();
                final String no=mEditText2.getText().toString().trim();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final String res=DateUtils.getRequest1(com,no);
                        Log.d(TAG, res);
                        getData(res);
                    }
                }).start();
            }
        });
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String data=datas.get(i);
                Intent intent=new Intent(MainActivity.this,ActivityB.class);
                intent.putExtra("data",data);
                startActivity(intent);
            }
        });
    }


    private void getData(String res) {
        Gson gson=new Gson();
        DataResult dataResults=gson.fromJson(res, DataResult.class);
        for (int i = 0; i <dataResults.getResult().getList().size() ; i++) {
            list1.add(dataResults.getResult().getList().get(i).getDatetime());
            datas.add(dataResults.getResult().getList().get(i).getRemark());
        }
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mAdapter.notifyDataSetChanged();
            }
        });

    }

    private void initView() {
        mEditText1= (EditText) findViewById(R.id.edt1);
        mEditText2= (EditText) findViewById(R.id.edt2);
        mButton= (Button) findViewById(R.id.btn);
        mTextView= (TextView) findViewById(R.id.tv);
        mListView= (ListView) findViewById(R.id.lv);
        mAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1);
        mListView.setAdapter(mAdapter);
    }
}
