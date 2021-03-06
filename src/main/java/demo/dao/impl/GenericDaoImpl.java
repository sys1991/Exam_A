package demo.dao.impl;

import demo.dao.GenericDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Administrator on 2016/5/26.
 */
public class GenericDaoImpl<T extends Serializable, ID extends Number> implements GenericDao<T, ID> {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    private String namespace;

    public GenericDaoImpl() {
        Class<T> modelClass;
        modelClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        namespace = modelClass.getSimpleName().toLowerCase();
    }

    @Override
    public void create(T model) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSession.insert(namespace + ".create", model);

    }

    @Override
    public void remove(ID id) {
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        sqlSession.delete(namespace + ".remove", id);

    }

    @Override
    public void modify(T model) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        sqlSession.update(namespace + ".modify", model);
    }

    @Override
    public List list() {
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession.selectList(namespace + ".list");
    }

    @Override
    public T search(ID id) {
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession.selectOne(namespace + ".search", id);
    }

    @Override
    public List list(String statement, Object parameter) {
        SqlSession sqlSession = sqlSessionFactory.openSession(false);
        return sqlSession.selectList(statement, parameter);
    }
}
