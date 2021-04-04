package com.example.lamzone;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import api.ApiMeetingService;
import butterknife.BindView;
import butterknife.ButterKnife;
import di.DI;
import events.DeleteMeetingEvent;
import model.Meeting;

public class MeetingRecyclerViewAdapter extends RecyclerView.Adapter<MeetingRecyclerViewAdapter.ViewHolder> {
        private final List<Meeting> mMeetings;
        private ApiMeetingService mApiServices;
        public MeetingRecyclerViewAdapter(List<Meeting> items) {
            mMeetings = items;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list_meeting, parent, false);
            return new ViewHolder(view);
        }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        mApiServices = DI.getApiMeetingService();
        Meeting meeting = mMeetings.get(position);
        holder.mMeetingNameTop.setText(meeting.getLocation()+"-"+meeting.getHours()+"h"+meeting.getMinutes()
                +"-"+meeting.getSubject());
        holder.mMeetingNameBottom.setText((CharSequence) meeting.getEmail());
        Glide.with(holder.mMeetingAvatar.getContext())
                .load(meeting.getAvatarUrl())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.mMeetingAvatar);

        holder.mDeleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data
                mApiServices.deleteMeeting(meeting);
                EventBus.getDefault().post(new DeleteMeetingEvent(meeting));
            }
        });
    }

        @Override
        public int getItemCount() {
            return mMeetings.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            @BindView(R.id.item_list_user_avatar)
            public ImageView mMeetingAvatar;
            @BindView(R.id.item_list_user_top)
            public TextView mMeetingNameTop;
            @BindView(R.id.item_list_user_bottom)
            public TextView mMeetingNameBottom;
            @BindView(R.id.item_list_user_delete_button)
            public  ImageButton mDeleteButton;
            public ViewHolder(View view) {
                super(view);
                ButterKnife.bind(this, view);
            }
        }
    }

