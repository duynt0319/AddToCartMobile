package duynt.com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter {
    public class ProductViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgProduct;
        private TextView tvProductName;
        private TextView tvDescription;
        private ImageView imgAddToCart;


        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            
        }
    }
}
