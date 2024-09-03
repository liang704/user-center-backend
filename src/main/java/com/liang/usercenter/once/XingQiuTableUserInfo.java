package com.liang.usercenter.once;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;


/*
* @author: liang
* @date: 2024/7/18
* @ClassName:
* @Description: 星球表格用户信息
* */
@Data
public class XingQiuTableUserInfo {
    /**
     * id
     */
    @ExcelProperty("成员编号")
    private String planetCode;

    /**
     * 用户昵称
     */
    @ExcelProperty("成员昵称")
    private String username;
}
