package haugv.hast.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author haugv
 * @description
 * @date 2021/3/29-10:18 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JSONResult<T> {

    private int code;
    private String message;
    private T data;

    public JSONResult(int code, String message){
        this(code, message, null);
    }

}
