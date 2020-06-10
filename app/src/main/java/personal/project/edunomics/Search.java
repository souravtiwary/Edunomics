package personal.project.edunomics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;

public class Search extends AppCompatActivity {

    AutoCompleteTextView search_tv;
    ImageButton searxh_btn;
    Button carrer, skill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search_tv = findViewById(R.id.search_et);
        searxh_btn = findViewById(R.id.serach_btn);
        carrer = findViewById(R.id.career);
        skill = findViewById(R.id.skill);

    }
}