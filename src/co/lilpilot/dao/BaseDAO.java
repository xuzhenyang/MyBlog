package co.lilpilot.dao;

import java.io.Serializable;
import java.util.List;
/**
 * Created by xuzywozz on 2016/5/24.
 */

/**
 * BaseDAO 定义DAO的通用操作
 */
public interface BaseDAO<T> {

    public void save(T entity);

    public void update(T entity);

    public void delete(Serializable id);

    public T findById(Serializable id);

    public List<T> findByHQL(String hql, Object... params);

}