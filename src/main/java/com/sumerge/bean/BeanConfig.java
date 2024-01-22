package com.sumerge.bean;// BeanConfig.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig{
    @Autowired
    private TopicRepository topicRepository;

    //@Bean()
    public TopicService topicService() {
        return new TopicService(topicRepository);
    }


}

