package com.liferay.mobilephones.service.persistence;

import com.liferay.mobilephones.NoSuchMobilePhoneException;
import com.liferay.mobilephones.model.MBMobilePhone;
import com.liferay.mobilephones.model.impl.MBMobilePhoneImpl;
import com.liferay.mobilephones.model.impl.MBMobilePhoneModelImpl;
import com.liferay.mobilephones.service.persistence.MBMobilePhonePersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the m b mobile phone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Leonardo Ribeiro
 * @see MBMobilePhonePersistence
 * @see MBMobilePhoneUtil
 * @generated
 */
public class MBMobilePhonePersistenceImpl extends BasePersistenceImpl<MBMobilePhone>
    implements MBMobilePhonePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link MBMobilePhoneUtil} to access the m b mobile phone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = MBMobilePhoneImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
            MBMobilePhoneModelImpl.FINDER_CACHE_ENABLED,
            MBMobilePhoneImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
            MBMobilePhoneModelImpl.FINDER_CACHE_ENABLED,
            MBMobilePhoneImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
            MBMobilePhoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MBMOBILEPHONE = "SELECT mbMobilePhone FROM MBMobilePhone mbMobilePhone";
    private static final String _SQL_COUNT_MBMOBILEPHONE = "SELECT COUNT(mbMobilePhone) FROM MBMobilePhone mbMobilePhone";
    private static final String _ORDER_BY_ENTITY_ALIAS = "mbMobilePhone.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MBMobilePhone exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(MBMobilePhonePersistenceImpl.class);
    private static MBMobilePhone _nullMBMobilePhone = new MBMobilePhoneImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<MBMobilePhone> toCacheModel() {
                return _nullMBMobilePhoneCacheModel;
            }
        };

    private static CacheModel<MBMobilePhone> _nullMBMobilePhoneCacheModel = new CacheModel<MBMobilePhone>() {
            public MBMobilePhone toEntityModel() {
                return _nullMBMobilePhone;
            }
        };

    @BeanReference(type = MBMobilePhonePersistence.class)
    protected MBMobilePhonePersistence mbMobilePhonePersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the m b mobile phone in the entity cache if it is enabled.
     *
     * @param mbMobilePhone the m b mobile phone
     */
    public void cacheResult(MBMobilePhone mbMobilePhone) {
        EntityCacheUtil.putResult(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
            MBMobilePhoneImpl.class, mbMobilePhone.getPrimaryKey(),
            mbMobilePhone);

        mbMobilePhone.resetOriginalValues();
    }

    /**
     * Caches the m b mobile phones in the entity cache if it is enabled.
     *
     * @param mbMobilePhones the m b mobile phones
     */
    public void cacheResult(List<MBMobilePhone> mbMobilePhones) {
        for (MBMobilePhone mbMobilePhone : mbMobilePhones) {
            if (EntityCacheUtil.getResult(
                        MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
                        MBMobilePhoneImpl.class, mbMobilePhone.getPrimaryKey()) == null) {
                cacheResult(mbMobilePhone);
            } else {
                mbMobilePhone.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all m b mobile phones.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(MBMobilePhoneImpl.class.getName());
        }

        EntityCacheUtil.clearCache(MBMobilePhoneImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the m b mobile phone.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(MBMobilePhone mbMobilePhone) {
        EntityCacheUtil.removeResult(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
            MBMobilePhoneImpl.class, mbMobilePhone.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<MBMobilePhone> mbMobilePhones) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (MBMobilePhone mbMobilePhone : mbMobilePhones) {
            EntityCacheUtil.removeResult(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
                MBMobilePhoneImpl.class, mbMobilePhone.getPrimaryKey());
        }
    }

    /**
     * Creates a new m b mobile phone with the primary key. Does not add the m b mobile phone to the database.
     *
     * @param id the primary key for the new m b mobile phone
     * @return the new m b mobile phone
     */
    public MBMobilePhone create(long id) {
        MBMobilePhone mbMobilePhone = new MBMobilePhoneImpl();

        mbMobilePhone.setNew(true);
        mbMobilePhone.setPrimaryKey(id);

        return mbMobilePhone;
    }

    /**
     * Removes the m b mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the m b mobile phone
     * @return the m b mobile phone that was removed
     * @throws com.liferay.mobilephones.NoSuchMobilePhoneException if a m b mobile phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public MBMobilePhone remove(long id)
        throws NoSuchMobilePhoneException, SystemException {
        return remove(Long.valueOf(id));
    }

    /**
     * Removes the m b mobile phone with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the m b mobile phone
     * @return the m b mobile phone that was removed
     * @throws com.liferay.mobilephones.NoSuchMobilePhoneException if a m b mobile phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MBMobilePhone remove(Serializable primaryKey)
        throws NoSuchMobilePhoneException, SystemException {
        Session session = null;

        try {
            session = openSession();

            MBMobilePhone mbMobilePhone = (MBMobilePhone) session.get(MBMobilePhoneImpl.class,
                    primaryKey);

            if (mbMobilePhone == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchMobilePhoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(mbMobilePhone);
        } catch (NoSuchMobilePhoneException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected MBMobilePhone removeImpl(MBMobilePhone mbMobilePhone)
        throws SystemException {
        mbMobilePhone = toUnwrappedModel(mbMobilePhone);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, mbMobilePhone);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(mbMobilePhone);

        return mbMobilePhone;
    }

    @Override
    public MBMobilePhone updateImpl(
        com.liferay.mobilephones.model.MBMobilePhone mbMobilePhone,
        boolean merge) throws SystemException {
        mbMobilePhone = toUnwrappedModel(mbMobilePhone);

        boolean isNew = mbMobilePhone.isNew();

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, mbMobilePhone, merge);

            mbMobilePhone.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
            MBMobilePhoneImpl.class, mbMobilePhone.getPrimaryKey(),
            mbMobilePhone);

        return mbMobilePhone;
    }

    protected MBMobilePhone toUnwrappedModel(MBMobilePhone mbMobilePhone) {
        if (mbMobilePhone instanceof MBMobilePhoneImpl) {
            return mbMobilePhone;
        }

        MBMobilePhoneImpl mbMobilePhoneImpl = new MBMobilePhoneImpl();

        mbMobilePhoneImpl.setNew(mbMobilePhone.isNew());
        mbMobilePhoneImpl.setPrimaryKey(mbMobilePhone.getPrimaryKey());

        mbMobilePhoneImpl.setId(mbMobilePhone.getId());
        mbMobilePhoneImpl.setName(mbMobilePhone.getName());
        mbMobilePhoneImpl.setBrand(mbMobilePhone.getBrand());
        mbMobilePhoneImpl.setDescription(mbMobilePhone.getDescription());
        mbMobilePhoneImpl.setReleaseDate(mbMobilePhone.getReleaseDate());
        mbMobilePhoneImpl.setPrice(mbMobilePhone.getPrice());

        return mbMobilePhoneImpl;
    }

    /**
     * Returns the m b mobile phone with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the m b mobile phone
     * @return the m b mobile phone
     * @throws com.liferay.portal.NoSuchModelException if a m b mobile phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MBMobilePhone findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the m b mobile phone with the primary key or throws a {@link com.liferay.mobilephones.NoSuchMobilePhoneException} if it could not be found.
     *
     * @param id the primary key of the m b mobile phone
     * @return the m b mobile phone
     * @throws com.liferay.mobilephones.NoSuchMobilePhoneException if a m b mobile phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public MBMobilePhone findByPrimaryKey(long id)
        throws NoSuchMobilePhoneException, SystemException {
        MBMobilePhone mbMobilePhone = fetchByPrimaryKey(id);

        if (mbMobilePhone == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
            }

            throw new NoSuchMobilePhoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                id);
        }

        return mbMobilePhone;
    }

    /**
     * Returns the m b mobile phone with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the m b mobile phone
     * @return the m b mobile phone, or <code>null</code> if a m b mobile phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public MBMobilePhone fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the m b mobile phone with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the m b mobile phone
     * @return the m b mobile phone, or <code>null</code> if a m b mobile phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public MBMobilePhone fetchByPrimaryKey(long id) throws SystemException {
        MBMobilePhone mbMobilePhone = (MBMobilePhone) EntityCacheUtil.getResult(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
                MBMobilePhoneImpl.class, id);

        if (mbMobilePhone == _nullMBMobilePhone) {
            return null;
        }

        if (mbMobilePhone == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                mbMobilePhone = (MBMobilePhone) session.get(MBMobilePhoneImpl.class,
                        Long.valueOf(id));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (mbMobilePhone != null) {
                    cacheResult(mbMobilePhone);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(MBMobilePhoneModelImpl.ENTITY_CACHE_ENABLED,
                        MBMobilePhoneImpl.class, id, _nullMBMobilePhone);
                }

                closeSession(session);
            }
        }

        return mbMobilePhone;
    }

    /**
     * Returns all the m b mobile phones.
     *
     * @return the m b mobile phones
     * @throws SystemException if a system exception occurred
     */
    public List<MBMobilePhone> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the m b mobile phones.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of m b mobile phones
     * @param end the upper bound of the range of m b mobile phones (not inclusive)
     * @return the range of m b mobile phones
     * @throws SystemException if a system exception occurred
     */
    public List<MBMobilePhone> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the m b mobile phones.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of m b mobile phones
     * @param end the upper bound of the range of m b mobile phones (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of m b mobile phones
     * @throws SystemException if a system exception occurred
     */
    public List<MBMobilePhone> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<MBMobilePhone> list = (List<MBMobilePhone>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MBMOBILEPHONE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MBMOBILEPHONE;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<MBMobilePhone>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<MBMobilePhone>) QueryUtil.list(q,
                            getDialect(), start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the m b mobile phones from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (MBMobilePhone mbMobilePhone : findAll()) {
            remove(mbMobilePhone);
        }
    }

    /**
     * Returns the number of m b mobile phones.
     *
     * @return the number of m b mobile phones
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_MBMOBILEPHONE);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the m b mobile phone persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.mobilephones.model.MBMobilePhone")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<MBMobilePhone>> listenersList = new ArrayList<ModelListener<MBMobilePhone>>();

                for (String listenerClassName : listenerClassNames) {
                    Class<?> clazz = getClass();

                    listenersList.add((ModelListener<MBMobilePhone>) InstanceFactory.newInstance(
                            clazz.getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(MBMobilePhoneImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
