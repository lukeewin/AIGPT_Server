package top.lukeewin.chatapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lukeewin.chatapi.entity.Body;
import top.lukeewin.chatapi.utils.common.R;
import top.lukeewin.chatapi.utils.http.HttpUtil;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lukeewin
 * @since 2023-03-08
 */
@RestController
@RequestMapping("/openai")
public class ApiController {

    @PostMapping("/chat")
    public R chat(@RequestBody Body body) {

        String url = body.getUrl();

        String apiKey = body.getApiKey();

        List messages = body.getMessages();

        String responseJSON = HttpUtil.post(url, apiKey, messages);

        String content = HttpUtil.getContent(responseJSON);

        return R.ok().data("content", content);
    }
}

