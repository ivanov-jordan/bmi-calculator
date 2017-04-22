package info.ivanovi.apps.bmicalculatorpro;

import android.app.Application;

import info.ivanovi.apps.bmicalculatorpro.repository.ResultRepository;
import info.ivanovi.apps.bmicalculatorpro.repository.SimpleResultRepository;

public class BMIApplication extends Application {

    private ResultRepository resultRepository = new SimpleResultRepository();

    public ResultRepository getResultRepository() {
        return resultRepository;
    }
}
