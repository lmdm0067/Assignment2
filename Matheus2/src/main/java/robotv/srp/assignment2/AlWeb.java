package robotv.srp.assignment2;

/**
 * Created by Matheus on 05/01/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AlWeb extends Fragment{

    public AlWeb(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.al_web, container, false);

        return rootView;
    }
}
