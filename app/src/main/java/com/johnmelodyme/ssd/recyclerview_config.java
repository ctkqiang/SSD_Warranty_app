package com.johnmelodyme.ssd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.johnmelodyme.ssd.recyclerview_config.clientList.ClientAdapter;
import java.util.List;

public class recyclerview_config {
    private static Context context;
    private clientList.ClientAdapter ada;

    static class clientList extends RecyclerView.ViewHolder {
        private TextView ID;
        private TextView clientname;
        private TextView clientphone;
        private TextView dateofpurchase;
        private TextView agentphone;
        private TextView agentname;

        private String key;

        public clientList(ViewGroup parent){
            super(LayoutInflater.from(context)
            .inflate(R.layout.list, parent,false));

            ID = (TextView) itemView.findViewById(R.id.ID);
            clientname = (TextView) itemView.findViewById(R.id.clientname);
            clientphone = (TextView) itemView.findViewById(R.id.clientphone);
            dateofpurchase = (TextView) itemView.findViewById(R.id.purchasedate);
            agentphone = (TextView) itemView.findViewById(R.id.agentphone);
            agentname = (TextView) itemView.findViewById(R.id.agentname);
        }

        public void bind(Data data,  String key){
            ID.setText(data.getProductsserialnumber());
            clientname.setText(data.getClientname());
            clientphone.setText(data.getClientphonenumber());
            dateofpurchase.setText(data.getPurchasedate());
            agentphone.setText(data.getAgentphonenumber());
            agentname.setText(data.getAgentname());

            this.key = key;
        }

        static class ClientAdapter extends RecyclerView.Adapter<clientList>{
            private List<Data> datalist;
            private List<String> theKey;

            public ClientAdapter(List<Data> datalist, List<String> theKey) {
                this.datalist = datalist;
                this.theKey = theKey;
            }

            @NonNull
            @Override
            public clientList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new clientList(parent);
            }

            @Override
            public void onBindViewHolder(@NonNull clientList holder, int position) {
                holder.bind(datalist.get(position), theKey.get(position));
            }

            @Override
            public int getItemCount() {
                return datalist.size();
            }
        }
    }
    public void setConfig(RecyclerView rv, Context c, List<Data> d, List<String> key){
        context = c;
        ada = new ClientAdapter(d, key);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(ada);
    }
}