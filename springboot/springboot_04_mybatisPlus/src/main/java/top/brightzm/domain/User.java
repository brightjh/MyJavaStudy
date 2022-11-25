package top.brightzm.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/24 下午3:12
 */
@Data
public class User {

    private Long id;
    private String name;
    private String password;
    private int age;
    private String tel;

}
