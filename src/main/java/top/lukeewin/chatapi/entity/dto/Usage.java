package top.lukeewin.chatapi.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Luke Ewin
 * @create 2023-03-08 15:51
 */
@Data
public class Usage {

    @JsonProperty("prompt_tokens")
    private Integer promptTokens;

    @JsonProperty("completion_tokens")
    private Integer completionTokens;

    @JsonProperty("total_tokens")
    private Integer totalTokens;
}
