package com.test.xyz.daggersample.presenter.main;

public interface OnWeatherInfoCompletedListener {
    void onUserNameValidationError(int messageID);
    void onCityValidationError(int messageID);
    void onSuccess(String data);
    void onFailure(String errorMessage);
}
