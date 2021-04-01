package haugv.hast.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author haugv
 * @description
 * @date 2021/3/29-10:05 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User implements Serializable {

    private int id;
    private String loginName;
    private String password;
    private String email;
    private String phone;

}
