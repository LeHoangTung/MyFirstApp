package madeezi.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        textView = (TextView) findViewById(R.id.text);
        editText = (EditText) findViewById(R.id.edit);
    }

    public void onSubmit(View view) {
        int n = 0, sum = 0;
        try {
            n = Integer.parseInt(editText.getText().toString());
        } catch (NumberFormatException error) {
            error.printStackTrace();
            Toast.makeText(getBaseContext(), "invalid", Toast.LENGTH_SHORT).show();
        }
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        textView.setText(String.valueOf(sum));

    }
}
