package id.ac.polinema.skorbasket.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import id.ac.polinema.skorbasket.R;
import id.ac.polinema.skorbasket.viewmodels.SharedScore;

/**
 * A simple {@link Fragment} subclass.
 */
public class WinnerFragment extends Fragment {

	private TextView txtWinner;
	private Button btnReset;
	private SharedScore sharedScore;
	private Integer scoreHome=0;
	private Integer scoreVisitor=0;

	public WinnerFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_winner, container, false);
	}

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		txtWinner = view.findViewById(R.id.txtWinner);
		btnReset = view.findViewById(R.id.btnReset);
	}
}
