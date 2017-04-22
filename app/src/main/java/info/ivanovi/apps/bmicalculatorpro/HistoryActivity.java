package info.ivanovi.apps.bmicalculatorpro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import info.ivanovi.apps.bmicalculatorpro.repository.ResultRepository;

public class HistoryActivity extends AppCompatActivity {

    private ResultRepository resultRepository;
    private ResultsAdapter resultsAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        BMIApplication application = (BMIApplication) getApplication();
        resultRepository = application.getResultRepository();

        resultsAdapter = new ResultsAdapter(resultRepository.getResults());
        RecyclerView.LayoutManager rLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(rLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(resultsAdapter);
    }

}
