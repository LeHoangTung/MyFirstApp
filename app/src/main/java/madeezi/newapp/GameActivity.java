package madeezi.newapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class GameActivity extends AppCompatActivity {

    EditText etBillInput;
    TextView tvTip;
    TextView tvTotal;
    RadioGroup radioGroup;
    // n la tong tien hoa don
    double n = 0.0;
    // phan tram Tip
    double g = 0.1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        bindViews();
        setupEvents();
    }

    private void setupEvents() {
        etBillInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try {
                    n = Double.parseDouble(charSequence.toString());
                    updateViews();
                } catch (NumberFormatException ignored) {
                    tvTip.setText(String.format(Locale.getDefault(), "%.3f", 0.0));
                    tvTotal.setText(String.format(Locale.getDefault(), "%.3f", 0.0));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioButton) {
                    g = 0.1;
                    Toast.makeText(getBaseContext(), "10%", Toast.LENGTH_SHORT).show();
                    updateViews();
                } else if (i == R.id.radioButton2) {
                    g = 0.2;
                    Toast.makeText(getBaseContext(), "20%", Toast.LENGTH_SHORT).show();
                    updateViews();
                } else {
                    g = 0.25;
                    Toast.makeText(getBaseContext(), "25%", Toast.LENGTH_SHORT).show();
                    updateViews();
                }
            }
        });
    }

    private void bindViews() {
        etBillInput = (EditText) findViewById(R.id.etBillInput);
        tvTip = (TextView) findViewById(R.id.tvTip);
        tvTotal = (TextView) findViewById(R.id.tvTotal);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    private void updateViews() {
        tvTip.setText(String.format(Locale.getDefault(), "$%.3f", n * g));
        tvTotal.setText(String.format(Locale.getDefault(), "$%.3f", (g + 1) * n));
    }


}
