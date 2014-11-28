package org.lzj.bms.persist.impl;


import org.lzj.bms.entity.User;
import org.lzj.bms.persist.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, Integer> implements UserDao {


}
