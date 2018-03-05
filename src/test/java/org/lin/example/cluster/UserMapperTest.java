package org.lin.example.cluster;


import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
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
        // 初始化 成功标识
//        boolean result = false;
////// 初始化 User
//        User user = new User();
//
//// 保存 User
//        user.setName("Tom");
//        user.setId(3);
//        result = user.insert();
//
//// 更新 User
//        user.setAge(18);
//        result = user.updateById();

// 查询 User
//        User exampleUser = user.selectById(2);
//        System.out.println(exampleUser);
//
//// 查询姓名为‘张三’的所有用户记录
//        List<User> userList1 = user.selectList(
//                new EntityWrapper<User>().eq("name", "张三")
//        );

// 删除 User
//        result = user.deleteById();

//        DbContextHolder.setDbType(DBTypeEnum.one);
//        User user1 = userMapper.selectById(1);
//        System.out.println(user1);
//        EntityWrapper<User> ew = new EntityWrapper<>();
//        ew.setEntity(new User());
//        ew.setSqlSelect(" * ")
//                .where("name={0}","aaa");
//        System.out.println(ew.getSqlSegment());
//
//        List<Object> objects = userService.selectObjs(ew);
//        for (Object object : objects) {
//            System.out.println(object.toString());
//        }
//        List<User> users = userMapper.selectUsers();
//        System.out.println(users);
//        System.out.println(objects);
//        System.out.println(user);
    }

    @Test
    public void test2() {
        EntityWrapper<User> ew = new EntityWrapper<>();
        ew.eq("name", "aaa");
        List<User> users = userService.selectList(ew);
        System.out.println(users.toString());

    }


}