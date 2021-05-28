package com.example.demo;/**
 * ClassName:    User
 * Package:    com.example.test_springboot
 * Description:
 * Datetime:    2020/10/23   17:10
 * Author:   zxjwhale@163.com
 */

import lombok.Data;

import java.util.Date;

/**
 * @author zxj
 * @date 2020/10/23
 **/
@Data
public class User {
    private Long id;
    private String guid;
    private String name;
    private String age;
    private Date createTime;
}
