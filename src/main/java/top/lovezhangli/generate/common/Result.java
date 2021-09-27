package top.lovezhangli.generate.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.springframework.lang.NonNull;

/**
 * @description:
 * @author: liyh
 * @time: 2020/12/21 10:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Result {

    @NonNull
    private Integer code;

    @NonNull
    private String message;

    private Object data;


}