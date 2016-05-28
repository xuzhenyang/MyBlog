package co.lilpilot.service;

/**
 * Created by xuzywozz on 2016/5/24.
 */

import java.io.Serializable;
import java.util.List;

/**
 * BaseService 定义Service的通用操作
 */
public interface BaseService<T> {

    public void save(T entity);

    public void update(T entity);

    public void delete(Serializable id);

    public T getById(Serializable id);

    public List<T> getByHQL(String hql, Object... params);
}