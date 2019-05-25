package mees.edukathon.mosaik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class HomeWorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work);
    }

    public void onDiscussionButtonClicked(MenuItem item) {
        Intent intent = new Intent(this, ChatActivity.class);
        startActivity(intent);
    }

    public void onHomeWorkButtonClicked(MenuItem item) {

    }


    public void onScheduleButtonClicked(MenuItem item) {
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }

}
