package com.fxy.listener;

import com.fxy.Plugin;
import net.mamoe.mirai.contact.Group;
import net.mamoe.mirai.event.events.GroupMessageEvent;

import java.util.function.Consumer;

/**
 * @author fudon
 * @version 1.0
 * @date 2022/4/9 9:49
 */
public class TestListener implements Consumer<GroupMessageEvent> {

    public static final int OWNED_ME = 352041906;
    public static final int GROUP_YYJ = 389401003;

    @Override
    public void accept(GroupMessageEvent groupMessageEvent) {
        Group subject = groupMessageEvent.getSubject();
        Plugin.INSTANCE.getLogger().info("subject" + subject.toString());
        // 群名字
        Plugin.INSTANCE.getLogger().info(subject.getName().toString());
        // 群id
        Plugin.INSTANCE.getLogger().info(subject.getId() + "");
        // 群友id
        Plugin.INSTANCE.getLogger().info(subject.getOwner().getId() + "");
        // 群友群名称
        Plugin.INSTANCE.getLogger().info(subject.getOwner().getNick().toString());

        Plugin.INSTANCE.getLogger().info(subject.getOwner().getRemark().toString());
// 发消息
        if (subject.getId() == GROUP_YYJ) {
            Plugin.INSTANCE.getLogger().info("云游群发言");
            if (OWNED_ME == subject.getOwner().getId()) {
                Plugin.INSTANCE.getLogger().info("我自己发言");
            }
        } else {
            Plugin.INSTANCE.getLogger().info("非云游群发言");
        }
    }
}
