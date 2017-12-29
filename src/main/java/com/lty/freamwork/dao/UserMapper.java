package com.lty.freamwork.dao;

import com.lty.freamwork.pojo.Orders;
import com.lty.freamwork.pojo.QueryUserVo;
import com.lty.freamwork.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    public User findUserById(int id);
    public int insertUser(User user);
    public User findUserByHashMap(HashMap<String,Object> hashMap);
    public User findUserByPojo(QueryUserVo queryUserVo);
    public List<User> findUserByPojoList(QueryUserVo queryUserVo);
    public Orders findOrdersList();

}
