package khwelatestrun.khwela;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class home_page extends Activity implements View.OnClickListener {

    LinearLayout alarm,buy,mobilechat,track,notify,profile;
    TextView logout,login;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setLogo(R.drawable.displayme);
        getActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_home_page);

        //for the fragments appearing on the side
        //for the login edit profile as well as reset password
        //links
        alarm = (LinearLayout)findViewById(R.id.Alarm);
        buy = (LinearLayout)findViewById(R.id.Buyticket);
        mobilechat =(LinearLayout)findViewById(R.id.Chat);
        track =(LinearLayout)findViewById(R.id.Track);
        //track =(LinearLayout)findViewById(R.id.link_login);
        notify= (LinearLayout)findViewById(R.id.notification);
        profile=(LinearLayout)findViewById(R.id.help);


        alarm.setOnClickListener(this);
        buy.setOnClickListener(this);
        mobilechat.setOnClickListener(this);
        track.setOnClickListener(this);
        notify.setOnClickListener(this);
        profile.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        //links
        // redirecting to notification page
        if(v.getId() == notify.getId())
        {
            startActivity(new Intent(this, Notification.class));
        }
        // redirecting to alarm page
        if(v.getId() == alarm.getId())
        {
            startActivity(new Intent(this, Alarm.class));
        }
        // redirecting to password buy eticket  page (only buy when loged in)
        if(v.getId() == buy.getId())
       {
           startActivity(new Intent(this, Ticket.class));
       }
        // redirecting to chat page
        if(v.getId() == mobilechat.getId())
        {
            startActivity(new Intent(this, Chat.class));
        }
        // redirecting to train tracking page
       // if(v.getId() == track.getId())
        //{
          //  startActivity(new Intent(this, TrainTracking.class));
        //}
        if(v.getId() == track.getId())
        {
            startActivity(new Intent(this, Login.class));
        }

        if(v.getId() == profile.getId())
        {
            startActivity(new Intent(this, Profile.class));
        }
    }
}
