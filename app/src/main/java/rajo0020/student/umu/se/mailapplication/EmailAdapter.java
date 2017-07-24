package rajo0020.student.umu.se.mailapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dator on 2017-07-19.
 */

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {
    private List<Email> data = Collections.emptyList();
    private LayoutInflater inflater;

        public EmailAdapter(Context context, ArrayList<Email> data) {
            this.inflater = LayoutInflater.from(context);
            this.data = data;
        }
    // inflates the row layout from xml when needed
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recycler_view_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // binds the data to the textview in each row
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Email email = data.get(position);
        holder.titleView.setText(email.getTitle());
        holder.dateView.setText(email.getDate());
        holder.timeView.setText(email.getTime());
        holder.textView.setText(email.getText());

    }

    // total number of rows
    @Override
    public int getItemCount() {
        return data.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder  {
        public LinearLayout emailListItem;
        public TextView titleView;
        public TextView dateView;
        public TextView timeView;
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            emailListItem = (LinearLayout) itemView.findViewById(R.id.emailListItem);
            titleView = (TextView) itemView.findViewById(R.id.emailTitle);
            dateView = (TextView) itemView.findViewById(R.id.emailDate);
            timeView = (TextView) itemView.findViewById(R.id.emailTime);
            textView = (TextView) itemView.findViewById(R.id.emailText);
        }

    }


}
