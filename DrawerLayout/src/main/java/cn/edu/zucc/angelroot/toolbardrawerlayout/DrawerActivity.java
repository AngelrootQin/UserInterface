package cn.edu.zucc.angelroot.toolbardrawerlayout;

import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DrawerActivity extends AppCompatActivity {
    private String[] drawerLayoutListItem;
    private ListView drawerLayoutListView;
    private DrawerLayout drawerLayout;
    private ImageView planetImageView;
    TextView planetText1;
    TextView planetText2;
    TextView planetText3;
    TextView planetText4;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
       planetImageView = (ImageView)findViewById(R.id.imageV1);
        planetText1 = (TextView)findViewById(R.id.tv1);
        planetText2 = (TextView)findViewById(R.id.tv2);
        planetText3 = (TextView)findViewById(R.id.tv3);
        planetText4 = (TextView)findViewById(R.id.tv4);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        drawerLayoutListItem = getResources().getStringArray(R.array.planets);
        drawerLayoutListView = (ListView)findViewById(R.id.listView);
        drawerLayoutListView.setAdapter(new ArrayAdapter<String>(this,R.layout.listview_planet_textview, drawerLayoutListItem));
        drawerLayoutListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        planetText1.setText(R.string.planet_name_earth);
                        planetText2.setText(R.string.planet_mess_earth);
                        planetText3.setText(R.string.planet_grav_earth);
                        planetText4.setText(R.string.planet_size_earth);
                        planetImageView.setImageResource(R.mipmap.ib_earth_normal);
                        drawerLayout.setBackgroundResource(R.mipmap.plasma1080);
                        break;
                    case 1:
                        planetText1.setText(R.string.planet_name_venus);
                        planetText2.setText(R.string.planet_mess_venus);
                        planetText3.setText(R.string.planet_grav_venus);
                        planetText4.setText(R.string.planet_size_venus);
                        planetImageView.setImageResource(R.mipmap.ib_venus_normal);
                        drawerLayout.setBackgroundResource(R.mipmap.plasma720);
                        break;
                    case 2:
                        planetText1.setText(R.string.planet_name_jupiter);
                        planetText2.setText(R.string.planet_mess_jupiter);
                        planetText3.setText(R.string.planet_grav_jupiter);
                        planetText4.setText(R.string.planet_size_jupiter);
                        planetImageView.setImageResource(R.mipmap.ib_jupiter_normal);
                        drawerLayout.setBackgroundResource(R.mipmap.plasma480);
                        break;
                    case 3:
                        planetText1.setText(R.string.planet_name_neptune);
                        planetText2.setText(R.string.planet_mess_neptune);
                        planetText3.setText(R.string.planet_grav_neptune);
                        planetText4.setText(R.string.planet_size_neptune);
                        planetImageView.setImageResource(R.mipmap.ib_neptune_normal);
                        drawerLayout.setBackgroundResource(R.mipmap.plasma480);
                        break;
                    case 4:
                        planetText1.setText(R.string.planet_name_mars);
                        planetText2.setText(R.string.planet_mess_mars);
                        planetText3.setText(R.string.planet_grav_mars);
                        planetText4.setText(R.string.planet_size_mars);
                        planetImageView.setImageResource(R.mipmap.ib_mars_normal);
                        drawerLayout.setBackgroundResource(R.mipmap.plasma720);
                        break;

                }
                drawerLayout.closeDrawer(drawerLayoutListView);
                return;
            }
        });
    }
}
