package org.example.controller;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class DemoController {
    /*
    * 对话模型，调用阿里云百炼平台
    * ChatModel 所有大模型聊天的总的父接口,支持文本聊天交互模型*/
//    @Autowired
//    @Qualifier("deepseek")
//    private ChatModel deepseekchatModel;
//    @Autowired
//    @Qualifier("qwen")
//    private ChatModel qwenchatModel;
//
//    @GetMapping(value = "/hello/dochat")
//    public String doChat(@RequestParam(name = "question",defaultValue="你是谁") String question){
//        String result = qwenchatModel.call(question);
//        return result;
//    }
//    @GetMapping(value = "/hello/streamchat")
//    public Flux<String> chat2(@RequestParam(name = "question",defaultValue="你是谁") String question){
//        return deepseekchatModel.stream(question);
//    }

}