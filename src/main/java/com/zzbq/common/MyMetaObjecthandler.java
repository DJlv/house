package com.zzbq.common;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@Slf4j
public class MyMetaObjecthandler implements MetaObjectHandler {
    /**
     * 插入自动填充
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        long id=Thread.currentThread().getId();log.info("线程id {}",id);
        log.info("公共字段自动填充");
        log.info(metaObject.toString());
        metaObject.setValue("createUser", BaseContext.getCurrentId());
        metaObject.setValue("updateUser", BaseContext.getCurrentId());
    }

    /**
     * 更新自动填充
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {

        metaObject.setValue("updateUser", BaseContext.getCurrentId());

        long id=Thread.currentThread().getId();
        log.info("线程id {}",id);
        log.info("公共字段自动填充[update]");
        log.info(metaObject.toString());
    }
}
