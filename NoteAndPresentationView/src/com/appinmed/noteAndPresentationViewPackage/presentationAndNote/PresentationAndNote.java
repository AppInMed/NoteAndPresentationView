package com.appinmed.noteAndPresentationViewPackage.presentationAndNote;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;

import com.appinmed.noteAndPresentationViewPackage.R;
import com.appinmed.noteAndPresentationViewPackage.noteView.NoteViewFragment;
import com.artifex.mupdfdemo.MuPDFFragment;

public class PresentationAndNote extends FragmentActivity {

	private FrameLayout pdfLayout, noteLayout;
	private NoteViewFragment noteFrag;
	private MuPDFFragment pdfFrag;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.presentation_note_view);
		pdfLayout = (FrameLayout) findViewById(R.id.presentation_note_presentation_layout);
		noteLayout = (FrameLayout) findViewById(R.id.presentation_note_note_layout);

		noteFrag = new NoteViewFragment();
		noteFrag.setArguments(getIntent().getExtras());
		getSupportFragmentManager().beginTransaction().replace(R.id.presentation_note_note_layout, noteFrag).commit();
		
		pdfFrag = new MuPDFFragment();
		pdfFrag.setArguments(getIntent().getExtras());
		getSupportFragmentManager().beginTransaction().replace(R.id.presentation_note_presentation_layout, pdfFrag).commit();
	}

	
	public void OnMoreButtonClick(View v) {
		pdfFrag.OnMoreButtonClick(v);
	}

	public void OnCancelSearchButtonClick(View v) {
		pdfFrag.OnCancelSearchButtonClick(v);
	}
	
	public void OnCancelAnnotButtonClick(View v) {
		pdfFrag.OnCancelAnnotButtonClick(v);
	}
	
	public void OnHighlightButtonClick(View v) {
		pdfFrag.OnHighlightButtonClick(v);
	}
	
	public void OnUnderlineButtonClick(View v) {
		pdfFrag.OnUnderlineButtonClick(v);
	}
	
	public void OnStrikeOutButtonClick(View v) {
		pdfFrag.OnStrikeOutButtonClick(v);
	}
	
	public void OnInkButtonClick(View v) {
		pdfFrag.OnInkButtonClick(v);
	}
	
	public void OnCancelDeleteButtonClick(View v) {
		pdfFrag.OnCancelDeleteButtonClick(v);
	}
	
	public void OnDeleteButtonClick(View v) {
		pdfFrag.OnDeleteButtonClick(v);
	}
	
	public void OnCancelMoreButtonClick(View v) {
		pdfFrag.OnCancelMoreButtonClick(v);
	}
	
	public void OnPrintButtonClick(View v) {
		pdfFrag.OnPrintButtonClick(v);
	}
	
	public void OnCopyTextButtonClick(View v) {
		pdfFrag.OnCopyTextButtonClick(v);
	}
	
	public void OnEditAnnotButtonClick(View v) {
		pdfFrag.OnEditAnnotButtonClick(v);
	}
	
	public void OnCancelAcceptButtonClick(View v) {
		pdfFrag.OnCancelAcceptButtonClick(v);
	}
	
	public void OnAcceptButtonClick(View v) {
		pdfFrag.OnAcceptButtonClick(v);
	}
}
