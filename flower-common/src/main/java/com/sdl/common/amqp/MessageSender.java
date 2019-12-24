package com.sdl.common.amqp;

import com.sdl.common.base.enums.AmqpArgs;
import com.sdl.common.utils.wrapper.WrapMapper;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program flowerPaaS
 * @description: RibbitMq发送消息
 * @author: songdeling
 * @create: 2019/12/24 11:04
 */
@Component
public class MessageSender {

    @Resource
    AmqpTemplate amqpTemplate;

    public void send(Object object) {
        amqpTemplate.convertAndSend(AmqpArgs.DIRECT_EXCHANGE, AmqpArgs.DIRECT_ROUTING, WrapMapper.ok(object));
    }
}