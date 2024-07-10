package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;



public interface CategoryService {

//    新增分类
    void save(CategoryDTO categoryDTO);

//    分页查询
    PageResult pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

//    启用/禁用状态
    void startOrStop(Integer status, Long id);

//    根据id删除分类
    void deleteById(Long id);


//    根据类型获取分类
List<Category> list(Integer type);

//更新分类
    void update(CategoryDTO categoryDTO);

}
