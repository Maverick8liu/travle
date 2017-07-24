package com.hg.hgc.test.library.jedis;

import com.hg.hgc.core.feature.cache.redis.RedisCache;
import com.hg.hgc.core.feature.test.TestSupport;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * JedisTest : 测试 jedis 功能
 *
 * @author smile_pengbin
 * @since 2015-03-20 10:32
 */
public class JedisTest extends TestSupport {


    @Resource
    private RedisCache redisCache;


    @Test
    public void testSet() {
        redisCache.cache("anchor", "smile_pengbin", 1 * 60 * 24);
    }

    @Test
    public void testGet() {
        System.out.printf(redisCache.get("anchor"));
    }
}
