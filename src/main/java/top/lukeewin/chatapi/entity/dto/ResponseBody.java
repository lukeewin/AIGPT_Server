package top.lukeewin.chatapi.entity.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Luke Ewin
 * @create 2023-03-08 15:49
 */
@Data
public class ResponseBody {

    private String id;

    private String object;

    private Long created;

    private String model;

    private Usage usage;

    private List<Choices> choices;

}
