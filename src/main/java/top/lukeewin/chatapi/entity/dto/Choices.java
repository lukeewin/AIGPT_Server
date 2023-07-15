package top.lukeewin.chatapi.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Luke Ewin
 * @create 2023-03-08 15:53
 */
@Data
public class Choices {

    private Message message;

    @JsonProperty("finish_reason")
    private String finishReason;

    private Integer index;
}
