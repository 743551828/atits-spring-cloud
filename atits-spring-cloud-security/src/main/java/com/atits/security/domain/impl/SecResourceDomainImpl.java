package com.atits.security.domain.impl;

import com.atits.base.contants.BaseStatus;
import com.atits.base.item.SelfUserDetail;
import com.atits.base.utils.BeanCopierUtil;
import com.atits.base.utils.CurrentUserUtil;
import com.atits.base.utils.TimeUtil;
import com.atits.security.domain.ISecResourceDomain;
import com.atits.security.entity.SecResourceEntity;
import com.atits.security.model.request.SecResourceSaveRequest;
import com.atits.security.repository.SecResourceRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Optional;

/**
 * 资源
 *
 * @author zhangys
 * @date  2020-10-14 17:22
 **/
@Component
public class SecResourceDomainImpl implements ISecResourceDomain {

    @Autowired
    private SecResourceRepository secResourceRepository;

    @Override
    public SecResourceEntity save(SecResourceSaveRequest secResourceSaveRequest) {
        SecResourceEntity entity = BeanCopierUtil.copy(secResourceSaveRequest, SecResourceEntity.class);
        SelfUserDetail userDetail = CurrentUserUtil.getUserDetail();
        entity.createInit(userDetail.getCode(),
                TimeUtil.getSystemTime(),
                null != this.findByMaxSortNum(secResourceSaveRequest.getParentCode()) ?this.findByMaxSortNum(secResourceSaveRequest.getParentCode()).getSortNum()+1:0);
        return secResourceRepository.save(entity);
    }

    @Override
    public SecResourceEntity findByMaxSortNum(String parentCode) {
        SecResourceEntity entity = new SecResourceEntity();
        entity.setParentCode(parentCode);
        Page<SecResourceEntity> entities = secResourceRepository.findAll(Example.of(entity), PageRequest.of(0, 1, Sort.Direction.DESC, "sortNum"));
        return CollectionUtils.isEmpty(entities.getContent())?null:entities.getContent().get(0);
    }

    @Override
    public SecResourceEntity findByCode(String code) {
        if (StringUtils.isBlank(code)){
            return null;
        }
        Optional<SecResourceEntity> entity = secResourceRepository.findById(code);
        return entity.orElse(null);
    }
}
