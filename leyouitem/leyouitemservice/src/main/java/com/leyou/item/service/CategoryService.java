package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoriesByPid(Long id){
        Category category = new Category();

        category.setParentId(id);
        return this.categoryMapper.select(category);
    }

    public  List<String> queryNamesByIds(List<Long> ids){
        ArrayList<String> list = new ArrayList<>();

        ids.forEach(id->{
            Category category = this.categoryMapper.selectByPrimaryKey(id);
            String name = category.getName();
            if (name==null){}else {
                list.add(name);
            }
        });
        return list;
    }
}
