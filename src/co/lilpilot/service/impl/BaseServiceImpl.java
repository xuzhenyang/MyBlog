package co.lilpilot.service.impl;

/**
 * Created by xuzywozz on 2016/5/24.
 */

import co.lilpilot.service.BaseService;
import co.lilpilot.dao.BaseDAO;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;


/**
 * BaseServiceImpl 定义Service的通用操作的实现
 */
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * 注入BaseDAO
     */
    private BaseDAO<T> dao;

    public void setDao(BaseDAO<T> dao) {
        this.dao = dao;
    }

    public void save(T entity) {
        dao.save(entity);
    }

    public void update(T entity) {
        dao.update(entity);
    }

    public void delete(Serializable id) {
        dao.delete(id);
    }

    public T getById(Serializable id) {
        return dao.findById(id);
    }

    public List<T> getByHQL(String hql, Object... params) {
        return dao.findByHQL(hql, params);
    }
}  