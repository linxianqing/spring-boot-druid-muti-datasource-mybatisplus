package org.lin.example.springbootdruidmutidatasourcemybatisplus.cluster;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.lin.example.springbootdruidmutidatasourcemybatisplus.entity.User;
import org.lin.example.springbootdruidmutidatasourcemybatisplus.mapper.UserMapper;
import org.lin.example.springbootdruidmutidatasourcemybatisplus.service.UserService;
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
    public void test() {
//        User user1 = userMapper.selectById(1);
//        System.out.println(user1);
        User user = userService.selectById(1);
        System.out.println(user);
    }
}