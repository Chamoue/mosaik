package mees.edukathon.mosaik;

import android.content.Intent;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ChatActivity extends AppCompatActivity {

    private BottomNavigationView filterNavigationView;
    private boolean showFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        this.filterNavigationView = findViewById(R.id.filter_navigation);
        this.filterNavigationView.setVisibility(View.INVISIBLE);
        this.showFilter = false;
    }

    public void onDiscussionButtonClicked(MenuItem item) {
        this.showFilter = !this.showFilter;
        if (this.showFilter) {
            this.filterNavigationView.setVisibility(View.VISIBLE);
        }
        else {
            this.filterNavigationView.setVisibility(View.INVISIBLE);
        }
    }

    public void onHomeWorkButtonClicked(MenuItem item) {
        Intent intent = new Intent(this, HomeWorkActivity.class);
        startActivity(intent);
    }

    public void onScheduleButtonClicked(MenuItem item) {
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }
}
