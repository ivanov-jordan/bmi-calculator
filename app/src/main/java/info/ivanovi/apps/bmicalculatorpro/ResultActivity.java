package info.ivanovi.apps.bmicalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resultView;

    private Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        result = (Result) intent.getSerializableExtra(MainActivity.MESSAGE_RESULT);

        resultView = (TextView) findViewById(R.id.resultValue);
        ((Button) findViewById(R.id.backButton)).setOnClickListener(view -> {
            finish();
        });

        showResult();
    }

    private void showResult() {
        resultView.setText(result.getFormattedResult());
        resultView.animate().setDuration(3000).alpha(1f);
    }

}
