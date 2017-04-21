package info.ivanovi.apps.bmicalculatorpro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    private List<Result> resultList = new ArrayList<>();

    private RecyclerView recyclerView;
    private ResultsAdapter resultsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        resultsAdapter = new ResultsAdapter(resultList);
        RecyclerView.LayoutManager rLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(rLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(resultsAdapter);

        prepareData();
    }

    private void prepareData() {
        resultList.add(new Result(23d));
        resultList.add(new Result(25.7d));
        resultList.add(new Result(31.8d));
        resultsAdapter.notifyDataSetChanged();
    }

}
