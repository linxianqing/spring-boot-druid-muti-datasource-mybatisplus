package org.lin.example.cluster;


import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lin.example.config.datasource.DBTypeEnum;
import org.lin.example.config.datasource.DbContextHolder;
import org.lin.example.entity.User;
import org.lin.example.mapper.UserMapper;
import org.lin.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA         <br/>
 * author:  linxianqin              <br/>
 * Date:    2018/3/3                 <br/>
 * Email:   linxianqinwork@qq.com   <br/>
 * Desc:    automaticGeneration     <br/>
 * 描述:     自动生成                 <br/>
 *
 * @author linxianqin               <br/>
 * @date 2018/3/3
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    @Autowired
    private UserService userService;

    @Autowired
    UserMapper userMapper;

    @Test
    public void test1() {
//        DbContextHolder.setDbType(DBTypeEnum.one);
//        User user1 = userMapper.selectById(1);
//        System.out.println(user1);
        User user = userService.select(1);
        System.out.println(user);
    }

    @Test
    public void test2() {
        DbContextHolder.setDbType(DBTypeEnum.tow);
        List<User> userList = userService.selectList(new EntityWrapper<User>());
        for (User user : userList) {
            System.out.println(user.getId() + "#" + user.getName() + "#" + user.getAge());
        }

        DbContextHolder.setDbType(DBTypeEnum.one);
        List<User> idsUserList = userService.selectList(new EntityWrapper<User>());
        for (User user : idsUserList) {
            System.out.println(user.getId() + "#" + user.getName() + "#" + user.getAge());
        }
    }


}