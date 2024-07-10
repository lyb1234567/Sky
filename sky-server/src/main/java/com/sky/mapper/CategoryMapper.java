package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @Insert("insert into category(type, name, sort, status, create_time, update_time, create_user, update_user)" +
            " VALUES" +
            " (#{type}, #{name}, #{sort}, #{status}, #{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    void insert(Category category);


//    修改分类属性
    void update(Category category);

//    根据id删除分类
    @Delete("delte from category where id=#{id}")
    void deleteById(long id);


// 根据类型查询分类

    List<Category> list(Integer type);

//    分页查询分类模块
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);




}
