package info.ivanovi.apps.bmicalculatorpro.repository;

import java.util.List;

import info.ivanovi.apps.bmicalculatorpro.model.Result;

public interface ResultRepository {

    void addResult(Result result);
    List<Result> getResults();

}
