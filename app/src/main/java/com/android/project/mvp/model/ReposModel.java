package com.android.project.mvp.model;


import com.android.project.base.BaseModel;
import com.android.project.mvp.contract.ReposContract;
import com.android.project.mvp.model.bean.RepoBean;
import com.android.project.mvp.model.service.ReposService;

import java.util.List;

import io.reactivex.rxjava3.core.Observable;

/**
 * @author Finn
 * @date 2020
 */
public class ReposModel extends BaseModel implements ReposContract.Model {

    @Override
    public Observable<List<RepoBean>> getRepos(String username) {
        return getRepository().create(ReposService.class).getRepos(username);
    }
}
