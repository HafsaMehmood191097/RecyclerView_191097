package com.hafsamehmood.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

   private List<Model> list;
    Adapter(List<Model> list){this .list=list;}

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int imageofburger=list.get(position).getImageBurger();
        int imageofReviews=list.get(position).getImageReviews();
        int imagedlt=list.get(position).getImageDelete();
        String BurgerName=list.get(position).getBurgerName();
        String BurgerType=list.get(position).getBurgerType();
        String BurgerReviews=list.get(position).getBurgerReviews();
        String DividerLine=list.get(position).getDivider();
        holder.setData(imageofburger,imageofReviews,imagedlt,BurgerName,BurgerType,BurgerReviews,DividerLine);
      holder.DeleteImage.setOnLongClickListener(new View.OnLongClickListener() {
          @Override
          public boolean onLongClick(View v) {
              list.remove(holder.getAbsoluteAdapterPosition());
              notifyItemRemoved(holder.getAbsoluteAdapterPosition());
              return true;
          }
      });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView BurgerImage;
        private ImageView ReviewsImage;
        private ImageView DeleteImage;
        private TextView NameBurger;
        private TextView PriceBurger;
        private TextView ReviewsBurger;
        private TextView Divider_line;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         BurgerImage=itemView.findViewById(R.id.imgview);
         ReviewsBurger=itemView.findViewById(R.id.num_reviews);
         DeleteImage=itemView.findViewById(R.id.deleteicon);
         ReviewsImage=itemView.findViewById(R.id.reviwstrs);
         Divider_line=itemView.findViewById(R.id.divider);
         PriceBurger=itemView.findViewById(R.id.burgerprice);
         NameBurger=itemView.findViewById(R.id.burgername);

        }

        public void setData(int imageofburger, int imageofReviews, int imagedlt ,String burgerName, String burgerType, String burgerReviews,String divider_line) {
            BurgerImage.setImageResource(imageofburger);
            ReviewsImage.setImageResource(imageofReviews);
            DeleteImage.setImageResource(imagedlt);
            NameBurger.setText(burgerName);
            PriceBurger.setText(burgerType);
            ReviewsBurger.setText(burgerReviews);
            Divider_line.setText(divider_line);
        }
    }
}
