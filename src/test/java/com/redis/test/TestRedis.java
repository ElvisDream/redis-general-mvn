package com.redis.test;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by Elivs on 2017/4/26.
 */
public class TestRedis {

    private Jedis jedis;

    @Before
    public void setUp() throws Exception {

        jedis = new Jedis("localhost");

    }

    @Test
    public void test1() throws Exception {
        jedis.set("a", "A");
        System.out.println(jedis.get("a"));
    }


}
