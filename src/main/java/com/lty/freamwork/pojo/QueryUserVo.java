package com.lty.freamwork.pojo;

import java.util.List;

public class QueryUserVo {
    private User user;

    private UserCostom userCostom;

    private List<Integer> list;

    public UserCostom getUserCostom() {
        return userCostom;
    }

    public void setUserCostom(UserCostom userCostom) {
        this.userCostom = userCostom;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }
}
