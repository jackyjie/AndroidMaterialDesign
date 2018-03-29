package com.example.materialdesign.ToolBar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialdesign.R;

public class ToolBarMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button toolbar_btn1;
    private Button toolbar_btn2;
    private Button toolbar_btn3;
    private Button toolbar_btn4;
    private Button toolbar_btn5;
    private Button toolbar_btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar_menu);
        toolbar_btn1 = (Button)findViewById(R.id.menu_toolbar1);
        toolbar_btn2 = (Button)findViewById(R.id.menu_toolbar2);
        toolbar_btn3 = (Button)findViewById(R.id.menu_toolbar3);
        toolbar_btn4 = (Button)findViewById(R.id.menu_toolbar4);
//        toolbar_btn1 = (Button)findViewById(R.id.menu_toolbar1);
//        toolbar_btn1 = (Button)findViewById(R.id.menu_toolbar1);
        toolbar_btn1.setOnClickListener(this);
        toolbar_btn2.setOnClickListener(this);
        toolbar_btn3.setOnClickListener(this);
        toolbar_btn4.setOnClickListener(this);
//        toolbar_btn1.setOnClickListener(this);
//        toolbar_btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.menu_toolbar1:
                intent = new Intent(this, ToolbarActivity.class);
                startActivity(intent);
                break;
            case R.id.menu_toolbar2:
                intent = new Intent(this, ToolbarSlideActivity.class);
                startActivity(intent);
                break;
            case R.id.menu_toolbar3:
                intent = new Intent(this, NavigationViewActivity.class);
                startActivity(intent);
                break;
//            case R.id.menu_toolbar4:
//                intent = new Intent(this, CollapsingToolbarActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.menu_toolbar1:
//                intent = new Intent(this, ToolbarActivity.class);
//            startActivity(intent);
//                break;
//            case R.id.menu_toolbar1:
//                intent = new Intent(this, ToolbarActivity.class);
//            startActivity(intent);
//                break;
        }
    }
}
