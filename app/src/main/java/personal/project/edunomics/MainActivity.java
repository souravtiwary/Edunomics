package personal.project.edunomics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView search;
    CardView impact;
    CardView intiative;
    CardView blog;
    CardView about;
    CardView alpha;
    CardView opportunity;
    CardView social;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search = findViewById(R.id.search);
        impact = findViewById(R.id.impact);
        intiative = findViewById(R.id.intiative);
        blog = findViewById(R.id.blogs);
        about = findViewById(R.id.about);
        alpha = findViewById(R.id.alpha);
        social = findViewById(R.id.social);
        opportunity = findViewById(R.id.opportunity);

        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Social Media Account", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Social.class));
            }
        });

        opportunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Opportunities", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Opportunity.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Search.class));
            }
        });

        impact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Impacts", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Impacts.class));
            }
        });

        intiative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Initiatives", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Initiative.class));
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Blogs", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Blog.class));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "About", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, About.class));
            }
        });
        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Alpha", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Alpha.class));
            }
        });

    }
}