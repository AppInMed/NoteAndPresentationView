package com.appinmed.noteAndPresentationViewPackage.noteView;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.appinmed.noteAndPresentationViewPackage.R;

public class NoteViewFragment extends Fragment {
	
	private Button saveButton, cancelButton;
	private EditText textView;
	private TextView saveText;
	private Note note;
	private String type;
	private boolean withNote;
	
	private View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		Bundle receiveBundle = getActivity().getIntent().getExtras();
		type = (String) receiveBundle.get("type");
		withNote = (Boolean) receiveBundle.get("from");
		
		note = new Note("id", "This is a sample note text", "Note title");
		
		view = inflater.inflate(R.layout.note, container, false);
		
        saveButton = (Button) view.findViewById(R.id.note_save_button);
        saveButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				saveButtonOnClick(v);
			}
		});
        
        cancelButton = (Button) view.findViewById(R.id.note_cancel_button);
        cancelButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				cancelButtonOnClick(v);
			}
		});
        
        saveText = (TextView) view.findViewById(R.id.note_save_text); 
        textView = (EditText) view.findViewById(R.id.editable_text_field);
        
        updateSaveLabel(false);
		
        textView.addTextChangedListener(new TextWatcher() {
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				updateSaveLabel(true);
			}
			public void afterTextChanged(Editable s) {}
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
		});
        
        return view;
	}
	
	
	public void saveButtonOnClick(View v) {
		
		note.setNoteText(textView.getText().toString());
		getActivity().finish();
	}
	
	public void cancelButtonOnClick(View v) {
		getActivity().finish();
	}
	
	public void updateSaveLabel(boolean isEdit) {
		
		if (isEdit) {
			saveText.setTextColor(getResources().getColor(R.color.red));
			saveText.setText("Not saved");
		} else {
			saveText.setTextColor(getResources().getColor(R.color.green_dark));
			saveText.setText("Saved");
		}
	}
	
//	Global appState = ((Global) activity.getApplicationContext());

}
