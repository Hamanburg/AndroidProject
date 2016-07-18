package khwelatestrun.khwela;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Notification extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        TabHost tabs=(TabHost)findViewById(R.id.tabHost3);
        tabs.setup();

        TabHost.TabSpec infoTicket =tabs.newTabSpec("linearLayout");
        infoTicket.setContent(R.id.linearLayout);
        infoTicket.setIndicator("General");
        tabs.addTab(infoTicket);

        TabHost.TabSpec ts =tabs.newTabSpec("linearLayout2");
        ts.setContent(R.id.linearLayout2);
        ts.setIndicator("Events");
        tabs.addTab(ts);

        TabHost.TabSpec myticket =tabs.newTabSpec("linearLayout3");
        myticket.setContent(R.id.linearLayout3);
        myticket.setIndicator("Routes");
        tabs.addTab(myticket);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_notification, menu);
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
