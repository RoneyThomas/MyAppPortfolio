package foo.fast.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        //System.out.println(view.getId());
        switch (view.getId()) {
            case R.id.button1:
                Toast.makeText(this, "This button will launch " + this.getString(R.string.course_name_1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "This button will launch " + this.getString(R.string.course_name_2), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "This button will launch " + this.getString(R.string.course_name_3), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "This button will launch " + this.getString(R.string.course_name_4), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "This button will launch " + this.getString(R.string.course_name_5), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(this, "This button will launch " + this.getString(R.string.course_name_6), Toast.LENGTH_SHORT).show();
                break;
        }
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
}
