package info.ivanovi.apps.bmicalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    private TextView resultView;

    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        result = intent.getDoubleExtra(MainActivity.MESSAGE_RESULT, 0);

        resultView = (TextView) findViewById(R.id.resultValue);
        ((Button) findViewById(R.id.backButton)).setOnClickListener(view -> {
            finish();
        });

        showResult();
    }

    private void showResult() {
        resultView.setText(formatResult(result));
        resultView.animate().setDuration(3000).alpha(1f);
    }

    private String formatResult(double result) {
        return decimalFormat.format(result);
    }

}
