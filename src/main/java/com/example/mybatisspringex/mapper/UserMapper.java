package com.example.mybatisspringex.mapper;

import com.example.mybatisspringex.entity.User;
// import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
    User findById(int id);
    void insert(User user);
    void update(User user);
    void delete(int id);

    /*
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(int id);

    @Insert("INSERT INTO users (name, email, age) VALUES (#{name}, #{email}, #{age})")
    void insert(User user);

    @Update("UPDATE users SET name=#{name}, email=#{email}, age=#{age} WHERE id=#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id=#{id}")
    void delete(int id);
     */
}
