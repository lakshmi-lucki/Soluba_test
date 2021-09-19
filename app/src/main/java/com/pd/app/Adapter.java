package com.pd.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder> {

    private ArrayList<getnsetm> myarraylist;

    public Adapter(ArrayList<getnsetm> myarraylist) {

        this.myarraylist = myarraylist;
    }


    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;

        public myViewHolder(@NonNull View itemView) {
            super( itemView );

            iv = (ImageView) itemView.findViewById( R.id.image_row );
            tv = (TextView) itemView.findViewById( R.id.text_row );

        }
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.coins, parent, false );
        return new myViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        getnsetm abcd = myarraylist.get( position );
        holder.iv.setImageResource( abcd.getImage_gs() );
        holder.tv.setText( abcd.getText_gs() );

    }

    // count automatically wrt size of the images etc

    @Override
    public int getItemCount() {
        return myarraylist.size();
    }

}
