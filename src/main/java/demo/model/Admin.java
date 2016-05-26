package demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Administrator on 2016/5/26.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Admin extends BaseModel{
    private Integer id;
    private String username;
    private String password;

}
