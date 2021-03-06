package cn.edu.zucc.angelroot.userinterface;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private AnalogClock analogClock;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        analogClock = (AnalogClock) findViewById(R.id.analogClock);
        Button goneButton = (Button) findViewById(R.id.clockGone);
        Button invizButton = (Button) findViewById(R.id.clockInVisible);
        Button vizButton = (Button) findViewById(R.id.clockVisible);
        registerForContextMenu(analogClock);
        goneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analogClock.setVisibility(v.GONE);
            }
        });

        vizButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                analogClock.setVisibility(View.VISIBLE);
            }
        });

        invizButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                analogClock.setVisibility(View.INVISIBLE);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, textView);
                popupMenu.getMenuInflater().inflate(R.menu.main_popup, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.viz:
                                analogClock.setVisibility(View.VISIBLE);
                                break;
                            case R.id.inviz:
                                analogClock.setVisibility(View.INVISIBLE);
                                break;
                            case R.id.gone:
                                analogClock.setVisibility(View.GONE);
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_red:
                analogClock.setBackgroundColor(getResources().getColor(R.color.blood_red));
                return true;
            case R.id.action_blu:
                analogClock.setBackgroundColor(getResources().getColor(R.color.ocean_blue));
                return true;
            case R.id.action_grn:
                analogClock.setBackgroundColor(getResources().getColor(R.color.forest_green));
                return true;
            case R.id.action_org:
                analogClock.setBackgroundColor(getResources().getColor(R.color.burnt_orange));
                return true;
            case R.id.action_pur:
                analogClock.setBackgroundColor(getResources().getColor(R.color.deep_purple));
                return true;
            case R.id.action_yel:
                analogClock.setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                return true;
            case R.id.action_wht:
                analogClock.setBackgroundColor(Color.WHITE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.main_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                analogClock.setBackgroundColor(getResources().getColor(R.color.blood_red));
                return true;
            case R.id.blue:
                analogClock.setBackgroundColor(getResources().getColor(R.color.ocean_blue));
                return true;
            case R.id.green:
                analogClock.setBackgroundColor(getResources().getColor(R.color.forest_green));
                return true;
            case R.id.orange:
                analogClock.setBackgroundColor(getResources().getColor(R.color.burnt_orange));
                return true;
            case R.id.purple:
                analogClock.setBackgroundColor(getResources().getColor(R.color.deep_purple));
                return true;
            case R.id.yellow:
                analogClock.setBackgroundColor(getResources().getColor(R.color.banana_yellow));
                return true;
            case R.id.invisible:
                analogClock.setVisibility(View.INVISIBLE);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
