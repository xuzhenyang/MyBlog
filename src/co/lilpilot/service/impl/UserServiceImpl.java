package co.lilpilot.service.impl;

import co.lilpilot.dao.UserDAO;
import co.lilpilot.model.TbUserEntity;
import co.lilpilot.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by xuzywozz on 2016/5/24.
 */
@Transactional
public class UserServiceImpl extends BaseServiceImpl<TbUserEntity> implements UserService {
    UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean verifyUser(TbUserEntity user) {
        TbUserEntity origin = userDAO.findByName(user.getName());
        if (origin == null)
            return false;
        else {
//            System.out.println("input username : " + user.getName());
//            System.out.println("input userpwd : " + user.getPassword());
//            System.out.println("origin username : " + origin.getName());
//            System.out.println("origin userpwd : " + origin.getPassword());
            return origin.getPassword().equals(user.getPassword());
        }
    }
}
