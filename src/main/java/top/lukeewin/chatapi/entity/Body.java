package top.lukeewin.chatapi.entity;

import lombok.Data;

import java.util.List;

/**
 * 本地服务器调用的实体类
 * @author Luke Ewin
 * @create 2023-03-11 18:36
 */
@Data
public class Body {

    private String url;

    private String apiKey;

    private List messages;
}
