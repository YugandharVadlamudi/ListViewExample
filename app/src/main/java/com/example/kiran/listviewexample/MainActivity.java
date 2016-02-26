package com.example.kiran.listviewexample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
ListView ListDispaly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer[] AndroidChapters={1,2,3,4,5,6,7,8,910,11,12,13,26};
        /*
        * ArrayAdapter<>(Context,Layout name,Viewname,array)*/
        ArrayAdapter<Integer> ArrayObject=new ArrayAdapter<Integer>(getApplicationContext(),R.layout.activity_main,R.id.Tv_list_view,AndroidChapters);
        Log.d("arrayString",AndroidChapters.toString());
        Log.d("arrayAdaptorReturn",ArrayObject.toString());
        ListDispaly=(ListView)findViewById(R.id.LVArrayAdaptor);
        /*adding Adapter to Listview*/
        ListDispaly.setAdapter(ArrayObject);
    }
}
