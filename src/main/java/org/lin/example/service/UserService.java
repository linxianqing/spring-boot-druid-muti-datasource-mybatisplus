package org.lin.example.service;

import org.lin.example.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author linxianqinwork@qq.com
 * @since 2018-03-04
 */
public interface UserService extends IService<User> {
    User select(int i);

}
