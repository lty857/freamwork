package com.lty.freamwork.test;

import com.lty.freamwork.dao.UserMapper;
import com.lty.freamwork.pojo.*;
import com.lty.freamwork.pojo.QueryUserVo;
import com.lty.freamwork.utils.CreateSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class TestForMybatis {
    public static void main(String arg[]) throws IOException{
        SqlSessionFactory sqlSessionFactory = CreateSqlSession.getSqlSessionFactory();
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper= sqlSession.getMapper(UserMapper.class);



//        List<Integer> list = new LinkedList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        QueryUserVo queryUserVo=new QueryUserVo();
//        queryUserVo.setList(list);
//        List<User> users = userMapper.findUserByPojoList(queryUserVo);

            System.out.println( userMapper.findOrdersList());

        //传递pojo对象
//        QueryUserVo queryUserVo = new QueryUserVo();
//        UserCostom userCostom = new UserCostom();
//        userCostom.setId(1);
//        queryUserVo.setUserCostom(userCostom);
//        User user = userMapper.findUserByPojo(queryUserVo);
//        System.out.println(user.getUsername());



//        HashMap<String,Object> hashMap = new HashMap<String, Object>();
//        hashMap.put("id",2);
//        hashMap.put("username","nrz");
//        User u = userMapper.findUserByHashMap(hashMap);
//        User user = new User();
//        user.setId(7);
//        List<Integer> ids=new ArrayList<Integer>();
//        ids.add(1);
//        ids.add(4);
//        for(int i:ids){
//            System.out.print(i+" ");
//        }
//        QueryUserVo queryUser = new QueryUserVo();
//       queryUser.setList(ids);

//        User u=userMapper.findUserByPojo(queryUser);
//
//            System.out.println(u.getUsername()+"  "+u.getPassword());

        sqlSession.close();

    }
}
