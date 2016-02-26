package com.example.kiran.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Kiran on 17-11-2015.
 */
public class CustomListView extends Activity
{
    int[] imV_ides={R.drawable.android,R.drawable.cplusplus,R.drawable.ios,R.drawable.java,R.drawable.windows,R.drawable.mobile};
    String[] TV_name={"android","ios","java","windows"};
    ListView LV_display;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_file_listview_display);
        LV_display=(ListView)findViewById(R.id.LV_Custom);
        context=this;
        CustomAdaptorListView CAV=new CustomAdaptorListView(this,imV_ides,TV_name);
        LV_display.setAdapter(CAV);
        LV_display.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(getApplicationContext(Integer).toString(position)),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplication(),imagedisplay.class);
                i.putExtra("imagename",position);
                startActivity(i);
            }
        });
    }
    class CustomAdaptorListView extends BaseAdapter
    {
        String[] names_fill;
        int[] Imv_fill;
        Context contextname;
        LayoutInflater LINF;
        TextView TV_fill;
        ImageView Iv_fill;
        View Single_row;
        CustomAdaptorListView(Context  mainActivity,int[] Imv,String[] names)
        {
            names_fill=names;
            Imv_fill=Imv;
            contextname=mainActivity;
        }
        @Override
        public int getCount() {
            Toast.makeText(contextname,"getCoundmethod called first....",Toast.LENGTH_SHORT).show();
            return names_fill.length;
        }
        @Override
        public Object getItem(int position) {
            Toast.makeText(contextname,"getItem method called ....",Toast.LENGTH_SHORT).show();
            Log.d("Position name getItem", Integer.toString(position));
            return position;
        }
        @Override
        public long getItemId(int position) {
            Toast.makeText(contextname,"getItem id method ....",Toast.LENGTH_SHORT).show();
            Log.d("Position name getItemID", Integer.toString(position));
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Toast.makeText(contextname,"getView ....",Toast.LENGTH_SHORT).show();
            LINF=(LayoutInflater)contextname.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            Single_row=LINF.inflate(R.layout.custom_list_view,null,true);           /*find the id by layout file name*/
            TV_fill=(TextView)Single_row.findViewById(R.id.TVMainTitle);
            Iv_fill=(ImageView)Single_row.findViewById(R.id.IMdisplay);
            Iv_fill.setImageResource(Imv_fill[position]);
            TV_fill.setText(names_fill[position]);
            return Single_row;
        }
    /*
    * Construcotor**/
    }

}
