package co.lilpilot.action;

import co.lilpilot.model.TbUserEntity;
import co.lilpilot.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

/**
 * Created by xuzywozz on 2016/5/28.
 */
public class LoginAction extends ActionSupport {

    UserService userService;

    private TbUserEntity user;

    public TbUserEntity getUser() {
        return user;
    }

    public void setUser(TbUserEntity user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String checkLogin() {
        System.out.println("LoginAction - checkLogin");
        if (userService.verifyUser(user))
            return SUCCESS;
        else
            return INPUT;
    }
}
