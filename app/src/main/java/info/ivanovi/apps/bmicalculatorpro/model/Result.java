package info.ivanovi.apps.bmicalculatorpro.model;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Result implements Serializable {

    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    private Double result;

    public Result(Double result) {
        this.result = result;
    }

    public Double getResult() {
        return result;
    }

    public String getFormattedResult() {
        return (result != null) ? decimalFormat.format(result) : "";
    }

}
