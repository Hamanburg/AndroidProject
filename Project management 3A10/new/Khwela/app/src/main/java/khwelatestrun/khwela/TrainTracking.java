package khwelatestrun.khwela;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.String;

import static java.util.Calendar.*;

public class TrainTracking extends Activity {

    // global variable
    Calendar EstimatedArivalTime = Calendar.getInstance();
    EditText HoursMinutesSeconds,DayMonthYear;
    Calendar dt = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_tracking);

      /*  //text for storing the track estimation
        HoursMinutesSeconds =(EditText)findViewById(R.id.seonds_1);
        DayMonthYear =(EditText)findViewById(R.id.minutes_1);

        //DayMonthYear.setText(DATE);

        Timer time = new Timer();
        time.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                // it will be determinde by the values from the database
                if (EstimatedArivalTime.MINUTE != (60 - dt.HOUR_OF_DAY))
                {
                  HoursMinutesSeconds.setText(String.valueOf(dt.HOUR_OF_DAY + ":" + (60 - dt.MINUTE) + "," + (60 - dt.SECOND)));
                }
                else
                {
                    // train has arived (has 30 minites time slot)

                    set a new estimation
                }
            }
        },1000);*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_train_tracking, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
