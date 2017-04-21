package info.ivanovi.apps.bmicalculatorpro;

import java.text.DecimalFormat;

public class Result {

    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    private Double result;

    public Result() {}

    public Result(Double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public String getFormattedResult() {
        return (result != null) ? decimalFormat.format(result) : "";
    }

}
