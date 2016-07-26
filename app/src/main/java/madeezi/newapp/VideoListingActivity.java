package madeezi.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class VideoListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_listing);
    }

    public void Start(View view) {
        Toast.makeText(getBaseContext(), "start", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(VideoListingActivity.this, GameActivity.class);
        startActivity(intent2);
    }


    public void Block(View view) {
        Toast.makeText(getBaseContext(), "wait", Toast.LENGTH_SHORT).show();
        Intent intent3 = new Intent(VideoListingActivity.this, BlockActivity.class);
        startActivity(intent3);
    }
}
