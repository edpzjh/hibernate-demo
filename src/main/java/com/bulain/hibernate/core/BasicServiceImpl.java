package com.bulain.hibernate.core;

import com.bulain.common.exception.NotFoundException;
import com.bulain.common.exception.OptimisticLockingException;
import com.bulain.common.exception.ServiceException;
import com.bulain.common.model.Entity;
import com.bulain.common.model.Versionable;

public abstract class BasicServiceImpl<T> implements BasicService<T> {
    protected abstract BasicMapper<T> getBasicMapper();

    public T get(Integer id) {
        T selectByPrimaryKey = getBasicMapper().selectByPrimaryKey(id);
        if (selectByPrimaryKey == null) {
            throw new NotFoundException();
        }
        return selectByPrimaryKey;
    }
    public void insert(T record) {
        int count = getBasicMapper().insert(record);
        if (count != 1) {
            throw new ServiceException();
        }
    }
    public void update(T record) {
        if (record instanceof Entity) {
            Entity entity = (Entity) record;

            T get = getBasicMapper().selectByPrimaryKey(entity.getId());
            if (get == null) {
                throw new NotFoundException();
            }

            if (get instanceof Versionable && record instanceof Versionable) {
                Versionable dbRecord = (Versionable) get;
                Versionable memRecord = (Versionable) record;

                Long dbVersion = dbRecord.getVersion();
                Long memVersion = memRecord.getVersion();

                if (dbVersion != null && !dbVersion.equals(memVersion)) {
                    throw new OptimisticLockingException();
                }
            }
        }

        int count = 0;
        count = getBasicMapper().updateByPrimaryKey(record);
        if (count != 1) {
            throw new ServiceException();
        }
    }
    public void delete(Integer id) {
        int count = getBasicMapper().deleteByPrimaryKey(id);
        if (count != 1) {
            throw new ServiceException();
        }
    }
}
