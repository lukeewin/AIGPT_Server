package top.lukeewin.chatapi.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Luke Ewin
 * @create 2023-03-08 9:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomException extends RuntimeException {

    private Integer code;

    private String msg;
}
