package com.example.demo;/**
 * ClassName:    Status
 * Package:    com.example.test_springboot
 * Description:
 * Datetime:    2020/10/23   17:09
 * Author:   zxjwhale@163.com
 */

import java.util.concurrent.TimeUnit;

/**
 * @author zxj
 * @date 2020/10/23
 **/
public abstract class Status {

    /**
     * 过期时间相关枚举
     */
    public static enum ExpireEnum {
        //未读消息的有效期为30天
        UNREAD_MSG(30L, TimeUnit.DAYS);

        /**
         * 过期时间
         */
        private Long time;
        /**
         * 时间单位
         */
        private TimeUnit timeUnit;

        ExpireEnum(Long time, TimeUnit timeUnit) {
            this.time = time;
            this.timeUnit = timeUnit;
        }

        public Long getTime() {
            return time;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }
    }
}

