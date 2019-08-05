package com.outlook.bigkun.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghk
 * @since 2019/8/5
 */
public class FBSettingWindow {
    private String title;
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }
    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    public void display() {
        System.out.println("显示窗口:"+title);
        System.out.println("显示功能键:");
        for (Object o : functionButtons) {
            System.out.println(((FunctionButton)o).getName());
            System.out.println("------------------------------");
        }
    }
}
