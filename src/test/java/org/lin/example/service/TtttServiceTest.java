package org.lin.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lin.example.mapper.TtttMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA         <br/>
 * author:  linxianqin              <br/>
 * Date:    2018/3/5                 <br/>
 * Email:   linxianqinwork@qq.com   <br/>
 * Desc:    automaticGeneration     <br/>
 * 描述:     自动生成                 <br/>
 *
 * @author linxianqin               <br/>
 * @date 2018/3/5
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TtttServiceTest {
    @Autowired
    private TtttService ttttService;

    @Autowired
    TtttMapper ttttMapper;
    @Test
    public void test1() {
//        EntityWrapper<Tttt> ew = new EntityWrapper<Tttt>();
//        ew.setEntity(new Tttt());
//        ew.setSqlSelect("*")
//                .where("tesst={0}", 4);
//        System.out.println(ew.getSqlSegment());
//        List<Object> tesst = ttttService.selectObjs(
//                ew
//        );
//        System.out.println(tesst);
//        List<Object> tesst1 = ttttService.selectObjs(
//                new EntityWrapper<Tttt>()
//                        .where("name in('zhangsan')")
//        );
//        System.out.println(tesst1);

    }
}