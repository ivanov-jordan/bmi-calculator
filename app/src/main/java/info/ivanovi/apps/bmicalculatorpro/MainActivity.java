package info.ivanovi.apps.bmicalculatorpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE_RESULT = "bmicalculatorpro.MainActivity.RESULT";

    private EditText heightInput;
    private EditText weightInput;

    private TextView errorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightInput = (EditText) findViewById(R.id.heightInput);
        weightInput = (EditText) findViewById(R.id.weightInput);

        errorView = (TextView) findViewById(R.id.errorLabel);
    }

    public void submitForm(View view) {
        String heightStr = heightInput.getText().toString();
        String weightStr = weightInput.getText().toString();

        if (validateFields(heightStr, weightStr)) {
            int height = Integer.parseInt(heightStr);
            double weight = Double.parseDouble(weightStr);

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra(MESSAGE_RESULT, Calculator.calculateBMI(weight, height));
            startActivity(intent);
        }
    }

    private boolean validateFields(String heightStr, String weightStr) {
        if (weightStr == null || weightStr.trim().equals("")) {
            showErrorView(R.string.error_weight_empty);
            return false;
        }

        if (heightStr == null || heightStr.trim().equals("")) {
            showErrorView(R.string.error_height_empty);
            return false;
        }

        hideErrorView();
        return true;
    }

    private void showErrorView(int resId) {
        errorView.setText(resId);
        errorView.animate().setDuration(500).alpha(1);
    }

    private void hideErrorView() {
        errorView.setText("");
        errorView.setAlpha(0);
    }

}
