package top.lukeewin.chatapi.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Luke Ewin
 * @create 2023-03-06 15:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestBody implements Serializable {

    private static final long serialVersionUID = 1L;

    private String model;

    private List<Message> messages;
}
