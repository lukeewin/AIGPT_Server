package top.lukeewin.chatapi.utils.http;

import cn.hutool.http.HttpRequest;
import com.alibaba.fastjson.JSON;
import top.lukeewin.chatapi.entity.dto.ResponseBody;
import top.lukeewin.chatapi.entity.vo.RequestBody;
import top.lukeewin.chatapi.handler.CustomException;

import java.util.List;

/**
 * @author Luke Ewin
 * @create 2023-03-08 15:16
 */
public class HttpUtil {

    /**
     * 发送 post 请求到 ChatGPT API
     * @return 返回 ChatGPT 响应的 JSON 字符串
     */
    public static String post(String url, String apiKey, List list) {

        RequestBody requestBody = new RequestBody("gpt-3.5-turbo", list);

        String parameter = JSON.toJSONString(requestBody);

        String response = HttpRequest.post(url)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + apiKey)
                .body(parameter)
                .execute()
                .body();
        return response;
    }

    /**
     * 从响应的 JSON 字符串中获取文本内容
     * @return 文本内容
     */
    public static String getContent(String responseJSON) {
        try {
            ResponseBody response = JSON.parseObject(responseJSON, ResponseBody.class);
            String content = response.getChoices().get(0).getMessage().getContent();
            return content;
        } catch (Exception e) {
            throw new CustomException(20001, "处理响应结果异常");
        }
    }
}
