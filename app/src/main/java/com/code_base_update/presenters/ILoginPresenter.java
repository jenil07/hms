package com.code_base_update.presenters;

import android.content.Context;

import com.code_base_update.view.ILoginView;

public interface ILoginPresenter extends IBasePresenter<ILoginView>{
    void performLogin(String username,String password,int userType);

    void startSignUpActivity(Context mCtx);

    void startForgotPassWordActivity(Context mCtx);
}