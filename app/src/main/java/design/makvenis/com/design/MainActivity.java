package design.makvenis.com.design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.design.library.DesignTools;

public class MainActivity extends AppCompatActivity {


    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = ((TextView) findViewById(R.id.mTest));

        DesignTools designTools=new DesignTools();
        String show = designTools.show("Library调用");
        mTextView.setText(show);
    }
}
