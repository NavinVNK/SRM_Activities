package in.ac.srmuniv.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;;

public class SRM_Activities2 extends Activity {
	EditText txt;
	private static final String TAG = "LifeCycleMethodsActivity3---->";
	// Initialization of the Activity after it is first created. Must at least
	// call {@link android.app.Activity#setContentView setContentView()} to
	// describe what is to be displayed in the screen.
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.v(TAG, "onCreate() is called");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third);
		Button b=(Button)findViewById(R.id.button1);
		txt=(EditText)findViewById(R.id.editText1);

	}
	public void gotoSecond(View v)
	{
		Intent data = new Intent();
		data.setData(Uri.parse(txt.getText().toString()));
		setResult(RESULT_OK, data);
		finish();
	}
	// Called after onCreate(Bundle) — or after onRestart() when the activity
	// had been stopped, but is now again being displayed to the user. It
	// will be followed by onResume().
	@Override
	public void onStart() {
		Log.v(TAG, "onStart() is called");
		super.onStart();
	}

	// Called after onStop() when the current activity is being re-displayed
	// to the user (the user has navigated back to it). It will be followed
	// by onStart() and then onResume().
	@Override
	public void onRestart() {
		Log.v(TAG, "onRestart() is called");
		super.onRestart();
	}

	// Called after onRestoreInstanceState(Bundle), onRestart(), or onPause(),
	// for your activity to start interacting with the user. This is a good
	// place to begin animations, open exclusive-access devices (such as the
	// camera), etc.
	@Override
	public void onResume() {
		Log.v(TAG, "onResume() is called");
		super.onResume();
	}

	// Called as part of the activity lifecycle when an activity is going
	// into the background, but has not (yet) been killed. The counterpart
	// to onResume().
	@Override
	public void onPause() {
		Log.v(TAG, "onPause() is called");
		super.onPause();
	}

	// Called when you are no longer visible to the user. You will next
	// receive either onRestart(), onDestroy(), or nothing, depending on
	// later user activity.
	@Override
	public void onStop() {
		Log.v(TAG, "onStop() is called");
		super.onStop();
	}

	// Perform any final cleanup before an activity is destroyed. This
	// can happen either because the activity is finishing (someone called
	// finish() on it, or because the system is temporarily destroying
	// this instance of the activity to save space. You can distinguish
	// between these two scenarios with the isFinishing() method.
	@Override
	public void onDestroy() {
		Log.v(TAG, "onDestroy() is called");
		super.onDestroy();
	}

}