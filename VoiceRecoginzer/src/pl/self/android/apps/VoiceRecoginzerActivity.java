package pl.self.android.apps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.Menu;
import android.widget.Toast;

public class VoiceRecoginzerActivity extends Activity implements RecognitionListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		initSpeechRecoginzer();
	}
	private void initSpeechRecoginzer() {
		while(true) {
		SpeechRecognizer recognizer = SpeechRecognizer.createSpeechRecognizer(this);
		recognizer.setRecognitionListener(this);
		Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		  intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
		            "en-US");
		  intent.putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS,true);
		    recognizer.startListening(intent);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.voice_recoginzer, menu);
		return true;
	}
	@Override
	public void onReadyForSpeech(Bundle params) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onBeginningOfSpeech() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onRmsChanged(float rmsdB) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onBufferReceived(byte[] buffer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onEndOfSpeech() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onError(int error) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onResults(Bundle results) {
		for(String word :results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION))
			Toast.makeText(this, word,Toast.LENGTH_SHORT).show();
		
	}
	@Override
	public void onPartialResults(Bundle partialResults) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onEvent(int eventType, Bundle params) {
		// TODO Auto-generated method stub
		
	}


}
