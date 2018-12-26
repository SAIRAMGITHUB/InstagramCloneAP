package android.sairam.instagramcloneap;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class UsersTab extends Fragment {

    private ListView listView;
    private ArrayAdapter arrayAdapter;

    public UsersTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_users_tab, container, false);

        listView = view.findViewById(R.id.usersListView);
        ArrayList arrayList = new ArrayList();

        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");
        arrayList.add("Sai");
        arrayList.add("Sravya");

        arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        return view;
    }

}
