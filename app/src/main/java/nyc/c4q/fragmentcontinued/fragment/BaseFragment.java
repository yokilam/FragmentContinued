package nyc.c4q.fragmentcontinued.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import nyc.c4q.fragmentcontinued.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    private View rootView;
    private EditText editText;


    public BaseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_base, container, false);

        Button buttonOne = rootView.findViewById(R.id.button1);
        Button buttonTwo = rootView.findViewById(R.id.button2);
        Button buttonThree = rootView.findViewById(R.id.button3);
        Button buttonFour = rootView.findViewById(R.id.button4);
        Button buttonFive = rootView.findViewById(R.id.button5);
        editText = rootView.findViewById(R.id.edit_text);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment1 Fragment1= new Fragment1();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                String editTextContents = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("fragmentOne", editTextContents);
                Fragment1.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_container, Fragment1).addToBackStack("fragmentOne");
                fragmentTransaction.commit();
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 Fragment2 = new Fragment2();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                String editTextContents= editText.getText().toString();
                Bundle bundle= new Bundle();
                bundle.putString("fragmentTwo", editTextContents);
                Fragment2.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_container, Fragment2).addToBackStack("fragmentTwo");
                fragmentTransaction.commit();
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 Fragment3 = new Fragment3();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                String editTextContents= editText.getText().toString();
                Bundle bundle= new Bundle();
                bundle.putString("fragmentThree", editTextContents);
                Fragment3.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_container, Fragment3).addToBackStack("fragmentThree");
                fragmentTransaction.commit();
            }
        });

        return rootView;

        }
}


