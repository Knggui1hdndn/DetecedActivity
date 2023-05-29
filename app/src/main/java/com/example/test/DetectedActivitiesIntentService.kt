package com.example.test

import android.app.IntentService
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.google.android.gms.location.ActivityRecognitionResult
import com.google.android.gms.location.ActivityTransitionResult
import com.google.android.gms.location.DetectedActivity


class DetectedActivitiesIntentService() : IntentService("name") {

    override fun onHandleIntent(intent: Intent?) {
        Log.d("DetectedActivitiesIntentService", "Đã nhận được intent")
        val result = ActivityRecognitionResult.extractResult(intent!!)
        val detectedActivities = result?.probableActivities as ArrayList<DetectedActivity>
        Toast.makeText(applicationContext, "ok bé" + detectedActivities.size, Toast.LENGTH_SHORT)
            .show()
        for (activity in detectedActivities) {
            val activityType = activity.type
            val confidence = activity.confidence

            when (activityType) {
                DetectedActivity.IN_VEHICLE -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động: IN_VEHICLE, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động IN_VEHICLE
                }

                DetectedActivity.WALKING -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động: WALKING, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động IN_VEHICLE
                }

                DetectedActivity.RUNNING -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động: RUNNING, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động IN_VEHICLE
                }

                DetectedActivity.STILL -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động: STILL, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động IN_VEHICLE
                }

                DetectedActivity.ON_BICYCLE -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động: ON_BICYCLE, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động ON_BICYCLE
                }

                DetectedActivity.TILTING -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động: TILTING, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động IN_VEHICLE
                }

                DetectedActivity.ON_FOOT -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động: ON_FOOT, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động ON_FOOT
                }
                // Thêm các trường hợp khác tùy thuộc vào yêu cầu của bạn

                else -> {
                    Log.d(
                        "DetectedActivitiesIntentService",
                        "Hoạt động không xác định, Độ tin cậy: $confidence"
                    )
                    // Xử lý tương ứng cho hoạt động không xác định
                }
            }
        }
    }
}