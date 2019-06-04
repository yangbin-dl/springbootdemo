package mallfe.demo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class user {

    // id
    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String passWord;

    //姓名
    private String name;

    //年龄
    private Integer age;

    //性别，1男性，2女性
    private Integer sex;

    //出生日期
    private Date birthday;

    //创建时间
    private Date created;

    //修改时间
    private Date updated;

    //备注
    private String note;

    public user() {
    }
}
