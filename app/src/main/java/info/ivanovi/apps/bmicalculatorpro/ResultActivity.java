package info.ivanovi.apps.bmicalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ResultActivity extends AppCompatActivity {

    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        double result = intent.getDoubleExtra(MainActivity.MESSAGE_RESULT, 0);

        TextView resultView = (TextView) findViewById(R.id.resultValue);
        resultView.setText(formatResult(result));
        resultView.animate().setDuration(3000).alpha(1f);

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(view -> {
            finish();
        });
    }

    private String formatResult(double result) {
        return decimalFormat.format(result);
    }

}
