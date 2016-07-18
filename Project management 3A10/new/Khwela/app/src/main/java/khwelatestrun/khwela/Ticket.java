package khwelatestrun.khwela;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Ticket extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        TabHost tabs=(TabHost)findViewById(R.id.tabHost);
        tabs.setup();

        TabSpec infoTicket =tabs.newTabSpec("tag1");
        infoTicket.setContent(R.id.tab1);
        infoTicket.setIndicator(" Buy Ticket");
        tabs.addTab(infoTicket);

       TabHost.TabSpec ts =tabs.newTabSpec("tag2");
       ts.setContent(R.id.tab2);
        ts.setIndicator("My orders");
        tabs.addTab(ts);

    }
}
