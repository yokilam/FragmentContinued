package nyc.c4q.fragmentcontinued.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.fragmentcontinued.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {

    private View rootView;

    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_fragment3, container, false);

        TextView textView = rootView.findViewById(R.id.text3);

        Bundle bundle = getArguments();
        String textFromEditText= bundle.getString("fragmentThree");
        textView.setText(textFromEditText);

        return rootView;
    }

}
