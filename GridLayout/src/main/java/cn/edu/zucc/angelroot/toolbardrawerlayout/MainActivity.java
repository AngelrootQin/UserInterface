package cn.edu.zucc.angelroot.toolbardrawerlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
            case R.id.grid_layout:
                Intent intent_gl = new Intent(this,GridActivity.class);
                this.startActivity(intent_gl);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
