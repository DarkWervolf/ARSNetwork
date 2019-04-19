package com.example.user.arsnetwork;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.user.arsnetwork.Fragments.FeedFragment;
import com.example.user.arsnetwork.Fragments.MessagesFragment;
import com.example.user.arsnetwork.Fragments.NotificationsFragment;

public class MainActivity extends AppCompatActivity {

    FeedFragment feedFragment = new FeedFragment();
    MessagesFragment messagesFragment = new MessagesFragment();
    NotificationsFragment notificationsFragment = new NotificationsFragment();

    private RecyclerView messagesRecyclerView;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        //navigation select
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    FragmentTransaction transaction =  getSupportFragmentManager().beginTransaction();

                    transaction.replace(R.id.main_frame, feedFragment);
                    transaction.commit();
                    return true;
                case R.id.navigation_messages:
                    FragmentTransaction transaction1 =  getSupportFragmentManager().beginTransaction();

                    transaction1.replace(R.id.main_frame, messagesFragment);
                    transaction1.commit();
                    return true;
                case R.id.navigation_notifications:
                    FragmentTransaction transaction2 =  getSupportFragmentManager().beginTransaction();

                    transaction2.replace(R.id.main_frame, notificationsFragment);
                    transaction2.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //replacing main frame with feed fragment
        FragmentTransaction transaction =  getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame, feedFragment);
        transaction.commit();

        //setting up the bottom navigation menu
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

}
