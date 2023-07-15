package top.lukeewin.chatapi.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.lukeewin.chatapi.utils.common.R;

/**
 * @author Luke Ewin
 * @create 2023-03-08 9:54
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public R exception(Exception e) {
        return R.error().message("执行了全局异常处理");
    }

    @ExceptionHandler(CustomException.class)
    public R exception(CustomException e) {
        return R.error().code(e.getCode()).message(e.getMsg());
    }
}
