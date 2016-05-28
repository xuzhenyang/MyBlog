package co.lilpilot.dao.impl;

import co.lilpilot.dao.UserDAO;
import co.lilpilot.model.TbUserEntity;
import org.hibernate.Query;

/**
 * Created by xuzywozz on 2016/5/24.
 */
public class UserDAOImpl extends BaseDAOImpl<TbUserEntity> implements UserDAO {

    @Override
    public TbUserEntity findByName(String name) {
        String queryString = "from TbUserEntity where name = ?";
        Query queryObject = getSession().createQuery(queryString);
        queryObject.setString(0, name);
        TbUserEntity user = (TbUserEntity) queryObject.uniqueResult();
        return user;
    }
}
