

package com.example.cruddemo.mapper;

import com.example.cruddemo.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(Integer id);

    @Insert("INSERT INTO user(username, age, create_time) VALUES(#{username}, #{age}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(User user);

    @Update("UPDATE user SET username = #{username}, age = #{age} WHERE id = #{id}")
    void update(User user);
    
    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteById(Integer id);
}