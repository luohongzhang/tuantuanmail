package com.luohz.tuantuan.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luohz.common.utils.PageUtils;
import com.luohz.common.utils.Query;

import com.luohz.tuantuan.product.dao.CategoryDao;
import com.luohz.tuantuan.product.entity.CategoryEntity;
import com.luohz.tuantuan.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    @Override
    public List<CategoryEntity> listWithTree() {
        //1，查出所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2，组装树形结构
        //2.1 找到所有的1级分类
        List<CategoryEntity> level1 = categoryEntities.stream().filter(x -> x.getParentCid() == 0).map(x -> {
            x.setChilds(getChilds(x,categoryEntities));
            return x;
        }).sorted((x1,x2) -> {
            return (x1.getSort() == null ? 0 : x1.getSort()) - (x2.getSort() == null ? 0 : x2.getSort());
        }).collect(Collectors.toList());
        //2.2 找到
        return level1;
    }

    private List<CategoryEntity> getChilds(CategoryEntity entity, List<CategoryEntity> all){
        List<CategoryEntity> collect = all.stream().filter(x -> entity.getCatId() == x.getParentCid())
                .map(x -> {
            x.setChilds(getChilds(x, all));
            return x;
        }).sorted((x1, x2) -> {
            return (x1.getSort() == null ? 0 : x1.getSort()) - (x2.getSort() == null ? 0 : x2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

}