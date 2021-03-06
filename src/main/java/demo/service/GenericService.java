package demo.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/5/26.
 */
public interface GenericService<T extends Serializable, ID extends Number> {
    void create(T model);

    void remove(ID id);

    void modify(T model);

    List<T> list();

    T search(ID id);

    List<T> list(String statement, Object parameter);
}
