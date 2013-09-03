package com.appinmed.noteAndPresentationViewPackage.noteView;

import java.io.Serializable;



public class Note implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String fileName, noteText, room, time, type,typeName, url, noteId;
	int schemeDetail;
	
	public Note (String id, String noteText, String title) {
		this.noteText = noteText;
		this.typeName= title; 
		this.noteId =  id;
	}
	
	public String getNoteText() {
		return noteText;
	}

	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	public String getNoteId() {
		return noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	
	@Override
	public boolean equals(Object o) {
		
		Note note = (Note) o;
		
		return noteId.equals(note.noteId);
	}
	
}
