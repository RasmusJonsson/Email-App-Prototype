package rajo0020.student.umu.se.mailapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Dator on 2017-07-17.
 */


public class TabFragmentPromotions  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view_layout,container, false);
        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));
        emails.add(new Email("Title","17 July","20:17","Mail content"));

        final EmailAdapter emailAdapter = new EmailAdapter(TabFragmentPromotions.this.getActivity(),emails);
        final RecyclerView clv = (RecyclerView) view.findViewById(R.id.recyclerView);
        clv.setLayoutManager(new LinearLayoutManager(TabFragmentPromotions.this.getActivity()));
        clv.setHasFixedSize(true);
        clv.setAdapter(emailAdapter);
    }
}
