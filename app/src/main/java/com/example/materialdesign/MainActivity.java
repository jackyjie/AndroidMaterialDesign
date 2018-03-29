package com.example.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialdesign.ToolBar.ToolBarMenuActivity;
import com.example.materialdesign.ToolBar.ToolbarActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Button)findViewById(R.id.toolbar_test);
        toolbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent ;
        switch (v.getId()){
            case R.id.toolbar_test:
                intent = new Intent(this, ToolBarMenuActivity.class);
                startActivity(intent);
                break;
        }
    }
}
