package com.leyou.item.service;

import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecificationService {
        @Autowired
        private SpecGroupMapper specGroupMapper;
        @Autowired
        private SpecParamMapper paramMapper;

        public List<SpecGroup> queryGroupsByCid(Long cid){
            SpecGroup specGroup = new SpecGroup();
            specGroup.setCid(cid);
            return this.specGroupMapper.select(specGroup);
        }

    /**
     * 根据条件查询规格参数
     * @param gid
     * @return
     */
        public List<SpecParam> queryParams(Long gid){
            SpecParam specParam = new SpecParam();
            specParam.setGroupId(gid);
            return  this.paramMapper.select(specParam);

        }

}
