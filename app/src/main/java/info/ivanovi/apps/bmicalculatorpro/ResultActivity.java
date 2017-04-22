package info.ivanovi.apps.bmicalculatorpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import info.ivanovi.apps.bmicalculatorpro.model.Result;
import info.ivanovi.apps.bmicalculatorpro.repository.ResultRepository;

public class ResultActivity extends AppCompatActivity {

    private TextView resultView;

    private Result result;

    private ResultRepository resultRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        result = (Result) intent.getSerializableExtra(MainActivity.MESSAGE_RESULT);

        resultView = (TextView) findViewById(R.id.resultValue);
        (findViewById(R.id.backButton)).setOnClickListener(view -> finish());

        // save result to repository
        BMIApplication application = (BMIApplication) getApplication();
        resultRepository = application.getResultRepository();
        resultRepository.addResult(result);

        // show result to UI
        showResult();
    }

    private void showResult() {
        resultView.setText(result.getFormattedResult());
        resultView.animate().setDuration(3000).alpha(1f);
    }

}
