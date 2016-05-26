package demo.dao.impl;

import demo.dao.AdminDao;
import demo.model.Admin;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/5/26.
 */
@Repository
public class AdminDaoImpl extends GenericDaoImpl<Admin,Integer> implements AdminDao{
}
