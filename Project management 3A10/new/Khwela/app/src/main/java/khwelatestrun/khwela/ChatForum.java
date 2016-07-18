package khwelatestrun.khwela;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Calendar;

public class ChatForum extends Activity implements View.OnClickListener
{

    private EditText dbAddcomments;
    private EditText dbComentsStored;
    private Calendar calen = Calendar.getInstance();
    private Button post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        //dbComentsStored = (EditText)findViewById(R.id.edtFromDatabase);
        // set the information taken from the database o inter act with the coment box
        //dbComentsStored.setText("get text from database");

        //dbAddcomments = (EditText)findViewById(R.id.edtToDatabase);
        //post = (Button)findViewById(R.id.btnPost);
        //post.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chat, menu);
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

    @Override
    public void onClick(View v)
    {
        if(v.getId() == post.getId())
        {
            // save to database
            //dbAddcomments.getText();
            //must alseo save current instance
            //calen.DATE;
        }
    }
}
