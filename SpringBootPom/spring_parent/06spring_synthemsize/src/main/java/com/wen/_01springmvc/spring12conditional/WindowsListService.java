package com.wen._01springmvc.spring12conditional;

/**
 * @Author: wen
 * @Date: 2019/5/25 23:29
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
