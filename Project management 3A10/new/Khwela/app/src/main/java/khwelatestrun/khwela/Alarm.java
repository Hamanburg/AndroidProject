package khwelatestrun.khwela;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Alarm extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        TabHost tabs=(TabHost)findViewById(R.id.tabHost);
        tabs.setup();

        TabHost.TabSpec infoTicket =tabs.newTabSpec("tag1");
        infoTicket.setContent(R.id.tab1);
        infoTicket.setIndicator("Set_Alarm");
        tabs.addTab(infoTicket);

        TabHost.TabSpec ts =tabs.newTabSpec("tag2");
        ts.setContent(R.id.tab2);
        ts.setIndicator("See_ALl_alarms");
        tabs.addTab(ts);
    }
}
