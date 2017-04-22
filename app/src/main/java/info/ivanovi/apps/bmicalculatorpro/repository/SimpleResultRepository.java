package info.ivanovi.apps.bmicalculatorpro.repository;

import java.util.ArrayList;
import java.util.List;

import info.ivanovi.apps.bmicalculatorpro.model.Result;

/**
 * Simple implementation of {@link ResultRepository} that stores the calculated results in an {@link java.util.ArrayList}.
 */

public class SimpleResultRepository implements ResultRepository {

    private List<Result> results = new ArrayList<>();

    @Override
    public void addResult(Result result) {
        results.add(0, result);
    }

    @Override
    public List<Result> getResults() {
        return results;
    }
}
