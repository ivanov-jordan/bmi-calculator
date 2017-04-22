package info.ivanovi.apps.bmicalculatorpro;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import info.ivanovi.apps.bmicalculatorpro.model.Result;

public class ResultsAdapter extends RecyclerView.Adapter<ResultsAdapter.MyViewHolder> {

    private List<Result> resultList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView result;

        public MyViewHolder(View view) {
            super(view);
            result = (TextView) view.findViewById(R.id.resultHistory);
        }
    }


    public ResultsAdapter(List<Result> resultList) {
        this.resultList = resultList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.history_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Result result = resultList.get(position);
        holder.result.setText(result.getFormattedResult());
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }
}
