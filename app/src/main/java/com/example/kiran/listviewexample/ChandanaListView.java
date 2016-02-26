package com.example.kiran.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Kiran on 18-11-2015.
 */
public class ChandanaListView extends Activity {
    String[] District={"Agra","Allahabad","Aligarh","Ambedkar Nagar","Auriaya","Azamgarh","Barabanki","Bandaurn"};
    String[] HeadQuaters={"Agra1","Allahabad2","Aligarh3","Ambedkar Nagar4","Auriaya5","Azamgarh6","Barabanki7","Bandaurn8"};
    String[] PinCode={"282001","211002","202001","224122","206122","276001","275001","243601"};
    ListView LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chandana_listview_display_listviewtag);
        ChandanaCustomAdapterFill ChandanalistView=new ChandanaCustomAdapterFill(this,District,HeadQuaters,PinCode);
        LV=(ListView)findViewById(R.id.LV_Chandana_main_tag);
        LV.setAdapter(ChandanalistView);

    }
    /*ctrl+i immplement methods*/
    class ChandanaCustomAdapterFill extends BaseAdapter
    {
        String[] District,HeadQuaters,PinCodes;
        Context context;
        LayoutInflater LInflaterChandana;
        TextView tv_1,tv_2,tv_3;
        ChandanaCustomAdapterFill(Context mainActivity,String[] DistrictName,String[] HeadQuatersNames,String[] DistrictPinCodes)
        {
            context=mainActivity;
            District=DistrictName;
            HeadQuaters=HeadQuatersNames;
            PinCodes=DistrictPinCodes;
        }
        @Override
        public int getCount() {
            return District.length;
        }
        @Override
        public Object getItem(int position) {
            return position;
        }
        @Override
        public long getItemId(int position) {
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LInflaterChandana=(LayoutInflater)context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View LLH_TextView=LInflaterChandana.inflate(R.layout.task_list_view_chandana,null,true);
            tv_1=(TextView)LLH_TextView.findViewById(R.id.TV_fill_1);
            tv_2=(TextView) LLH_TextView.findViewById(R.id.TV_fill_2);
            tv_3=(TextView)LLH_TextView.findViewById(R.id.TV_fill_3);
//            Toast.makeText(getApplicationContext(),District[position],Toast.LENGTH_SHORT).show();
           tv_1.setText(District[position]);
            tv_2.setText(HeadQuaters[position]);
            tv_3.setText(PinCodes[position]);
            return LLH_TextView;
        }
    }
}
