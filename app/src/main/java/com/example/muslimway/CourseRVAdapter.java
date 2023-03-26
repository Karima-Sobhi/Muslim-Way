package com.example.muslimway;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseRVAdapter extends RecyclerView.Adapter<CourseRVAdapter.ViewHolder> {


    private ArrayList<CourseModal> ZekrModalArrayList;
    private Context context;

    // constructor
    public CourseRVAdapter(ArrayList<CourseModal> ZekrModalArrayList, Context context) {
        this.ZekrModalArrayList = ZekrModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        CourseModal modal = ZekrModalArrayList.get(position);
        holder.courseNameTV.setText(modal.getZekrName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(context, UpdateCourseActivity.class);


                i.putExtra("name", modal.getZekrName());


                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list
        return ZekrModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our text views.
        private TextView courseNameTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            courseNameTV = itemView.findViewById(R.id.TVZekrName);

        }
    }
}