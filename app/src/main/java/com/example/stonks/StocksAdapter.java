package com.example.stonks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StocksAdapter extends RecyclerView.Adapter<StocksAdapter.StockViewHolder> {
    private List<Stock> stockList;

    public StocksAdapter(List<Stock> stockList) {
        this.stockList = stockList;
    }

    @NonNull
    @Override
    public StockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_item, parent, false);
        return new StockViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StockViewHolder holder, int position) {
        Stock stock = stockList.get(position);
        holder.stockName.setText(stock.getName());
        holder.stockPrice.setText(String.format("$%.2f", stock.getCurrentPrice()));
        String changeText = String.format("%.2f (%.2f%%)", stock.getPriceChange(), stock.getPriceChangePercentage());
        holder.stockChange.setText(changeText);
        // Change color based on positive or negative change
        holder.stockChange.setTextColor(stock.getPriceChange() >= 0 ? 0xFF4CAF50 : 0xFFE53935);
    }

    @Override
    public int getItemCount() {
        return stockList.size();
    }

    public static class StockViewHolder extends RecyclerView.ViewHolder {
        TextView stockName, stockPrice, stockChange;

        public StockViewHolder(View view) {
            super(view);
            stockName = view.findViewById(R.id.stockName);
            stockPrice = view.findViewById(R.id.stockPrice);
            stockChange = view.findViewById(R.id.stockChange);
        }
    }
}
