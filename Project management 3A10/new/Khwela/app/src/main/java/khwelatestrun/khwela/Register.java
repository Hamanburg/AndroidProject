package khwelatestrun.khwela;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends Activity implements View.OnClickListener
{

    Button btnRegister;
    EditText ePassword,eUsername,eConfirm,eDOB,eName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        eName=(EditText)findViewById(R.id.eName);
        eDOB=(EditText)findViewById(R.id.eDOB);
        eUsername=(EditText)findViewById(R.id.eUsername);
        ePassword=(EditText)findViewById(R.id.ePassword);
        eConfirm=(EditText)findViewById(R.id.eConfirm);
        btnRegister=(Button)findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);
    }

    //this enables the class to handle clicks
    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.btnRegister:
                //what happens when the login button is pressed
                break;
        }
    }
}
