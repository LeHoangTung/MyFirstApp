package madeezi.newapp;

import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Typeface myTypeface;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView myTextView = (TextView) findViewById(R.id.label);
        editText1 = (EditText) findViewById(R.id.edit_text);
        editText2 = (EditText) findViewById(R.id.edit_text2);
        myTypeface = Typeface.createFromAsset(getAssets(), "fonts/LCALLIG.TTF");
        myTextView.setTypeface(myTypeface);
        Shader shader = new LinearGradient(0, 0, 0,
                myTextView.getTextSize(), getResources().getColor(R.color.dino2),
                getResources().getColor(R.color.dino1), Shader.TileMode.CLAMP);
        myTextView.getPaint().setShader(shader);

    }

    public void waiting(View view) {
        if (editText1.getText().toString().equals("12") && editText2.getText().toString().equals("9")) {
            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
        } else {
            Toast.makeText(getBaseContext(), "waiting", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this, VideoListingActivity.class);
            startActivity(intent);
        }
    }

    public void questionAC(View view) {
        Intent i = new Intent(LoginActivity.this, QuestionActivity.class);
        startActivity(i);
    }

}
