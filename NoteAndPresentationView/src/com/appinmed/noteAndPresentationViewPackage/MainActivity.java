package com.appinmed.noteAndPresentationViewPackage;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.appinmed.noteAndPresentationViewPackage.presentationAndNote.PresentationAndNote;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		File file = new File(this.getFilesDir() + File.separator + "DefaultProperties.xml");
		try {
			InputStream inputStream = getResources().openRawResource(R.raw.ex);
			FileOutputStream fileOutputStream = new FileOutputStream(file);

			byte buf[]=new byte[1024];
			int len;
			while((len=inputStream.read(buf))>0) {
				fileOutputStream.write(buf,0,len);
			}

			fileOutputStream.close();
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Uri uri = Uri.parse(file.getAbsolutePath());
		Intent intent = new Intent(this, PresentationAndNote.class);
		intent.setAction(Intent.ACTION_VIEW);
		intent.setData(uri);
		// ---- note view
		intent.putExtra("type", "abstract");
		intent.putExtra("from", false);
		// ---- /note view
		startActivity(intent);

		finish();
	}
}