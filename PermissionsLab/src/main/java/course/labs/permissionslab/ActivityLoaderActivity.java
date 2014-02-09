package course.labs.permissionslab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityLoaderActivity extends Activity {

	private static final String TAG = "Lab-Permissions";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loader_activity);

		Button startBookmarksButton = (Button) findViewById(R.id.start_bookmarks_button);
		startBookmarksButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				startBookMarksActivity();
			
			}
		});
	}

	private void startBookMarksActivity() {
		
		Log.i(TAG, "Entered startBookMarksActivity()");
	
		// TODO - Start the BookmarksActivity

		// Create an intent stating which Activity you would like to start
		Intent intent = new Intent(this, BookmarksActivity.class);

		// Launch the Activity using the intent
		startActivity(intent);
	}
}
