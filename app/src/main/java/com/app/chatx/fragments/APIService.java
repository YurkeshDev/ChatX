package com.app.chatx.fragments;


import com.app.chatx.Notifications.MyResponse;
import com.app.chatx.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAZwUDU6M:APA91bGgZey-Goovn5UHq2QInaSdNmNA8sCbK1S20Hm8vS-U2MDEdbvSmQD8NNEVG6h8AnIgK6qP2Le7R415I1dMyUwRlP-qU-WVqBCx-fXC98tREZKu2BRCJE-3fKXZ5diznlDPxfYS"
            }
    )

    @POST ("fcm/send")
   Call<MyResponse> sendNotification(@Body Sender body);
}
