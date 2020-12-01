package com.example.messenger.Fragments;

import com.example.messenger.Notifications.MyResponse;
import com.example.messenger.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABYFaPro:APA91bGq9hDyxh_jy5ctysJVUlYbIkIegzTz5HBDYYjNATgCBLtNjhhq6QmwyMpasSQoh4aw8-80nx5Yln5Vn9Hz23niS421FX4qLmoCRvkykJxFrYQUaoWYJKqOLL5fwR7W9t-ulHk9"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
