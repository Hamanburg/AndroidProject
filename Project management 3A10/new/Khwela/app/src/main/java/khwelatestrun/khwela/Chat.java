package khwelatestrun.khwela;

import android.app.Activity;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.Calendar;

public class Chat extends Activity
{
    private static final String TAG = "ChatActivity";
    private ChatArrayAdapter adp;
    private ListView list;
    private EditText chatText;
    private Button send;
    Intent intent;
    private boolean side = false;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        setContentView(R.layout.activity_chat);
        send = (Button) findViewById(R.id.btnSend);
        list = (ListView) findViewById(R.id.listview);
        adp = new ChatArrayAdapter(getApplicationContext(), R.layout.chat);
        list.setAdapter(adp);
        chatText = (EditText) findViewById(R.id.chat);
        chatText.setOnKeyListener(new View.OnKeyListener()
        {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode ==
                        KeyEvent.KEYCODE_ENTER))
                {
                    return sendChatMessage();
                }
                return false;
            }
        });
        send.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                sendChatMessage();
            }
        });
        list.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        list.setAdapter(adp);
        adp.registerDataSetObserver(new DataSetObserver()
        {
            public void OnChanged()
            {
                super.onChanged();
                list.setSelection(adp.getCount() -1);
            }
        });
    }
    private boolean sendChatMessage()
    {
        adp.add(new ChatMessage(side, chatText.getText().toString()));
        chatText.setText("");
        side = !side;
        return true;
    }
}


