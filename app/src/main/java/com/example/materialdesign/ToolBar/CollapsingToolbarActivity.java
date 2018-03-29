package com.example.materialdesign.ToolBar;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.materialdesign.R;

public class CollapsingToolbarActivity extends AppCompatActivity {

    private static final String FRUIT_NAME= "fruit_name";
    private static final String FRUIT_IMAGE_ID="fruit_image_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);
        Intent intent = getIntent();
        String fruitName = intent.getStringExtra(FRUIT_NAME);
        int fruitImageId = intent.getIntExtra(FRUIT_IMAGE_ID, 0);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapse_toolbar);
        ImageView fruitImageView = (ImageView)findViewById(R.id.fruit_image_view);
        TextView fruitContentText = (TextView)findViewById(R.id.fruit_content_text);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbarLayout.setTitle(fruitName);
        Glide.with(this).load(fruitImageId).into(fruitImageView);
        String fruitContent = generateFruitContent(fruitName);
        fruitContentText.setText(fruitContent);
    }

    private String generateFruitContent(String fruitName){
        StringBuilder fruitContent = new StringBuilder();
        for(int i = 0 ; i<500; i++){
            fruitContent.append(fruitName);
        }
        return fruitContent.toString();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static void actionStart(Context context, String fruitName, int fruitImageId){
        Intent intent = new Intent(context, CollapsingToolbarActivity.class);
        intent.putExtra(FRUIT_NAME, fruitName);
        intent.putExtra(FRUIT_IMAGE_ID, fruitImageId);
        context.startActivity(intent);
    }
}
