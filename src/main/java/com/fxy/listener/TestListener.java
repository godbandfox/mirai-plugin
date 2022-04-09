package com.fxy.listener;

import com.fxy.Plugin;
import net.mamoe.mirai.contact.Member;
import net.mamoe.mirai.event.events.GroupMessageEvent;

import java.util.function.Consumer;

/**
 * @author fudon
 * @version 1.0
 * @date 2022/4/9 9:49
 */
public class TestListener implements Consumer<GroupMessageEvent> {
    @Override
    public void accept(GroupMessageEvent groupMessageEvent) {

        Member sender = groupMessageEvent.getSender();
        if(sender.getId() == 352041906L){
            Plugin.INSTANCE.getLogger().info("我自己说话了");
            System.out.println();
        }else{
            Plugin.INSTANCE.getLogger().info("我没说话");
        }
    }
}
