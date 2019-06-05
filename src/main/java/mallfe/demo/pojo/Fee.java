package mallfe.demo.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 描述
 *
 * @author Yangbin
 * @since 2019/06/05
 */

@Data
@Table(name = "da_fee")
public class Fee {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String feeCode;

    private String feeName;

    private Integer pId;

    private Integer groupId;

    private Date createDate;

    private Integer createUserId;

    private String createUserCode;

    private String createUserName;

}
