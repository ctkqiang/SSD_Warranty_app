package com.johnmelodyme.ssd;
// https://www.youtube.com/watch?v=eCfJMseN0-8&t=1092s
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class Recycler_config {
    private Context mContext;

    class ClientView extends RecyclerView.ViewHolder {
        TextView ClientName;
        TextView ProductID;
        TextView ClientPhone;
        TextView agentName;
        TextView agentPhone;

        private String key;

        public ClientView(ViewGroup parent){
            super(LayoutInflater.from(mContext)
            .inflate(R.layout.user_list, parent, false));

            ClientName = (TextView) parent.findViewById(R.id.Client_name);
            
        }
    }
}
