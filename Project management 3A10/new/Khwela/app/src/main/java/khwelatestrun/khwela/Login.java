package khwelatestrun.khwela;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity implements View.OnClickListener
{
    Button btnLogin;
    EditText ePassword,eUseName;
    TextView Registration;

    private View container;
    private View helo;
    private View profile;
    private boolean playanimation=true;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        container=findViewById(R.id.container);
        helo=findViewById(R.id.welcome);
        profile=findViewById(R.id.profile);

        eUseName=(EditText)findViewById(R.id.eUsername);
        ePassword=(EditText)findViewById(R.id.ePassword);
        Registration=(TextView)findViewById(R.id.RegistrationLink);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    public void onWindowFocusChanged(boolean hasFocus)
    {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus && playanimation)
        {
            showContainer();
            showOtherItem();
            playanimation=false;
        }
    }

    private void showContainer()
    {
        float starthello=0-helo.getWidth();
        float endhelo=helo.getX();

        ObjectAnimator animate=ObjectAnimator.ofFloat(helo, View.X, starthello, endhelo);
        animate.setDuration(1500);
        helo.setVisibility(View.VISIBLE);
        animate.start();

        PropertyValuesHolder scaleholderX=PropertyValuesHolder.ofFloat(View.SCALE_X,1f);
        PropertyValuesHolder scaleholderY=PropertyValuesHolder.ofFloat(View.SCALE_Y,1f);
        ObjectAnimator animateProfile=ObjectAnimator.ofPropertyValuesHolder(profile,scaleholderX,scaleholderY);
        animateProfile.setDuration(1500);
        animateProfile.start();
    }

    private void showOtherItem()
    {
        container.animate().alpha(1f).setDuration(1000);
    }

    //this enables the class to handle clicks
    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.btnLogin:
                //what happens when the login button is pressed
                startActivity(new Intent(this,home_page.class));


                break;
            case R.id.RegistrationLink:
                startActivity(new Intent(this,Register.class));
                break;
        }
    }
}