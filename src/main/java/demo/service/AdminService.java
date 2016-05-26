package demo.service;

import demo.model.Admin;

/**
 * Created by Administrator on 2016/5/26.
 */
public interface AdminService extends GenericService<Admin,Integer> {
    Admin login(Admin admin);
}
