package co.lilpilot.service;

import co.lilpilot.model.TbUserEntity;

/**
 * Created by xuzywozz on 2016/5/24.
 */
public interface UserService extends BaseService<TbUserEntity> {
    public boolean verifyUser(TbUserEntity user);
}
