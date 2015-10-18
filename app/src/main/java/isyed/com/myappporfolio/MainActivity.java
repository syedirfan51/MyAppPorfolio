package isyed.com.myappporfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_heading);
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void buttonOnClick(View view)
    {
        switch(view.getId())
        {
            case R.id.buttonSpotify :
                Toast.makeText(this, "This button will launch the Spotify App!", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonScores :
                Toast.makeText(this, "This button will launch the Scores App!", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonLibrary :
                Toast.makeText(this, "This button will launch the Library App!", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonBigger :
                Toast.makeText(this, "This button will launch the Build It Bigger App!", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonReader :
                Toast.makeText(this, "This button will launch the XYZ Reader App!", Toast.LENGTH_LONG).show();
                break;
            case R.id.buttonCapstone:
                Toast.makeText(this, "This button will launch the Capstone App!", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
