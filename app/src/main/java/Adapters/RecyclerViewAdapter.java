package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Classes.R;

import java.util.List;

import Models.Forecast;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private List<Forecast> dataModelList;

    public RecyclerViewAdapter(List<Forecast> dataModelList) {
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_meteo_passive, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.textViewTemp.setText(String.valueOf(dataModelList.get(position).getMain().getTemp()));
        holder.textViewDate.setText(dataModelList.get(position).getDate());
        holder.textViewTemp.setText(dataModelList.get(position).getTime());
        holder.textViewTemp.setText(String.valueOf(dataModelList.get(position).getWeather().get(position).getIcon()));
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public long getItemId(int position) {
        return super.getItemId(position);
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTemp, textViewDate, textViewTime;
        ImageView imageViewWeather;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTemp = itemView.findViewById(R.id.textViewTemp);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            textViewTime = itemView.findViewById(R.id.textViewTime);
            imageViewWeather = itemView.findViewById(R.id.imageViewWeather);

        }
    }
}