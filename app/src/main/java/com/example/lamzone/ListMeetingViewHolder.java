package com.example.lamzone;


import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import model.Meeting;

public class ListMeetingViewHolder extends RecyclerView.ViewHolder {

    // FOR DESIGN ---
    private ImageView avatar;
    private TextView textOnTop;
    private TextView textOnBottom;
    private ImageButton deleteButton;

    public ListMeetingViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.item_list_user_avatar);
        textOnTop = itemView.findViewById(R.id.item_list_user_top);
        textOnBottom = itemView.findViewById(R.id.item_list_user_bottom);
        deleteButton = itemView.findViewById(R.id.item_list_user_delete_button);
    }

    public void bind(Meeting meeting, MeetingListAdapter.Listener callback) {
        Glide.with(itemView.getContext())
                .load(meeting.getAvatarUrl())
                .apply(RequestOptions.circleCropTransform())
                .into(avatar);
        textOnTop.setText(meeting.getLocation()+"-"+meeting.getHours()+"h"+meeting.getMinutes()
        +"-"+meeting.getSubject());
        textOnBottom.setText(meeting.getEmail());
        deleteButton.setOnClickListener(view -> callback.onClickDelete(meeting));
    }
}

