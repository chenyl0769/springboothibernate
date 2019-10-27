package com.cyl.springboothibernate.dao;

import com.cyl.springboothibernate.entity.User;
import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserDao extends JpaRepository<User,Integer> {
    /**
     * 根据用户id查找用户
     * @param id
     * @return
     */
    public User findUserById(Integer id);

    /**
     * 自定义根据用户名查询用户
     * @param name
     * @return
     */
    @Query("select u from User u where u.name =:name ")
    public User findBy(@Param("name") String name);

    /**
     * 自动以动过query增加用户
     * @param user
     */
    @Modifying
    @Query(value = "insert into stu (name,pwd) values (:#{#user.name},:#{#user.pwd})",nativeQuery = true)
    public void adduser(User user);



}
