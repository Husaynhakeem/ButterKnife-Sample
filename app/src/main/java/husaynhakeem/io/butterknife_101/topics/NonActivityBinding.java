package husaynhakeem.io.butterknife_101.topics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import husaynhakeem.io.butterknife_101.R;

public class NonActivityBinding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_binding);
    }
}