package top.brightzm.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/24 下午10:39
 */
@Data
public class Book {

    private Long id;
    private String type;
    @TableField(value = "name")
    private String bookName;
    @TableField(select = false)
    private String description;
    @TableField(exist = false)
    private Integer status;
    private Integer deleted;
    @Version
    private Integer version;


}
