package cn.edu.zucc.angelroot.toolbardrawerlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.linear_layout:
                Intent intent_ll = new Intent(this,LinearActivity.class);
                this.startActivity(intent_ll);
                break;
            case R.id.relative_layout:
                Intent intent_rl = new Intent(this,RelativeActivity.class);
                this.startActivity(intent_rl);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
