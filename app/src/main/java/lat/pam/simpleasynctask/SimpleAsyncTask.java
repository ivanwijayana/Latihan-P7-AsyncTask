package lat.pam.simpleasynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {

    public SimpleAsyncTask(TextView mTextView) {
        
    }

    @Override
    protected String doInBackground(Void... voids) {
        // Generate a random number between 0 and 10
        Random r = new Random();
        int n = r.nextInt(11);

        // Make the task take long enough that we have
        // time to rotate the phone while it is running
        int s = n * 200;

        // Sleep for the random amount of time
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Return String result
        return "Awake at last after sleeping for " + s + " milliseconds!";


    }
    protected void onPostExecute(String result) {
        TextView mTextView = null;
        mTextView.setText(result);
    }

}
