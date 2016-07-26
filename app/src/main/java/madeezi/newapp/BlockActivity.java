package madeezi.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BlockActivity extends AppCompatActivity {

    TextView textView;
    EditText textEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block);
        textView = (TextView) findViewById(R.id.write1);
        textEdit = (EditText) findViewById(R.id.number1);
    }

    public void set(View view) {
        tinhTichChan();

    }

    public void tinhTong() {
        int n = 0, sum = 0;
        try {
            n = Integer.parseInt(textEdit.getText().toString());
        } catch (NumberFormatException error) {
            error.printStackTrace();
            Toast.makeText(getBaseContext(), "invalid", Toast.LENGTH_SHORT).show();
        }
        if (n % 2 == 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }

            }
        } else {
            Toast.makeText(getBaseContext(), "invalid", Toast.LENGTH_SHORT).show();
        }
        textView.setText(String.valueOf(sum));
    }

    public void tinhTich() {
        int n = 1, tich = 1;
        try {
            n = Integer.parseInt(textEdit.getText().toString());
        } catch (NumberFormatException error) {
            error.printStackTrace();
            Toast.makeText(getBaseContext(), "invalid", Toast.LENGTH_SHORT).show();
        }
        for (int i = 1; i <= n; i++) {
            tich = tich * i;
        }
        textView.setText(String.valueOf(tich));
    }

    public void tinhT() {
        double n = 0, sum = 0;
        try {
            n = Integer.parseInt(textEdit.getText().toString());
        } catch (NumberFormatException error) {
            error.printStackTrace();
            Toast.makeText(getBaseContext(), "invalid", Toast.LENGTH_SHORT).show();
        }
        for (double i = 1; i <= n; i++) {
            sum += (1 / i);
        }
        textView.setText(String.valueOf(sum));
    }

    public void tinhTichChan() {
        int n = 1, tich = 1;
        try {
            n = Integer.parseInt(textEdit.getText().toString());
        } catch (NumberFormatException error) {
            error.printStackTrace();
            Toast.makeText(getBaseContext(), "invalid", Toast.LENGTH_SHORT).show();
        }
        if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    tich = tich * i;
            }
        } else {
            Toast.makeText(getBaseContext(), "invalid", Toast.LENGTH_SHORT).show();
        }
        textView.setText(String.valueOf(tich));
    }
}

