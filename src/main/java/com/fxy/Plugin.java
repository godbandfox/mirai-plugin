package com.fxy;

import com.fxy.listener.TestListener;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.events.GroupMessageEvent;

public final class Plugin extends JavaPlugin {
    public static final Plugin INSTANCE = new Plugin();

    private Plugin() {
        super(new JvmPluginDescriptionBuilder("com.fxy.plugin", "0.1")
                .name("TestPlugin")
                .info("测试插件")
                .author("Donghui")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
        //加载插件
        GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class,new TestListener());
    }
}