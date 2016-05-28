package co.lilpilot.dao;

import co.lilpilot.model.TbUserEntity;

/**
 * Created by xuzywozz on 2016/5/24.
 */
public interface UserDAO extends BaseDAO<TbUserEntity> {
    public TbUserEntity findByName(String name);
}
