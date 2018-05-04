package com.example.xiaoxiaoduan.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by xiaoxiaoduan on 2018/5/1.
 */

public  class MenuActivity extends  AppCompatActivity
{
    @Override
    protected void  onCreate(Bundle savedInstanceState)
    {
        setContentView(R.layout.menuview);
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        menu.add(0, 0, android.view.Menu.NONE, "菜单1").setIcon(R.drawable.ad);
        menu.add(0, 1, android.view.Menu.NONE, "菜单2").setIcon(R.drawable.ad);
        menu.add(0, 2, android.view.Menu.NONE, "菜单3").setIcon(R.drawable.ad);
        menu.add(0, 3, android.view.Menu.NONE, "菜单4").setIcon(R.drawable.ad);
        menu.add(0, 4, android.view.Menu.NONE, "菜单5").setIcon(R.drawable.ad);
        menu.add(0, 5, android.view.Menu.NONE, "菜单6").setIcon(R.drawable.ad);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Dialog(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void Dialog(int message) {
        new AlertDialog.Builder(this).setMessage(
                "您单击第【" + message + "】项Menu菜单项.").show();
    }
}