package com.example.lamzone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import api.ApiMeetingService;
import model.Meeting;

public class ListMeetingActivity extends AppCompatActivity implements MeetingListAdapter.Listener {

    RecyclerView recyclerView;
    MeetingListAdapter adapter;
    ApiMeetingService mApiMeetingService;

    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);
        configureFab();
        configureRecyclerView();
    }

    private void configureRecyclerView() {
        recyclerView = findViewById(R.id.activity_list_user_rv);
        adapter = new MeetingListAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    private void configureFab() {
        fab = findViewById(R.id.activity_list_user_fab);
        fab.setOnClickListener(view -> {
//            loadData();
        });
    }

    @Override
    public void onClickDelete(Meeting meeting) {

    }

//    private void loadData() {
//        adapter.updateList(getApplication());
//    }



}