package com.xiangyang.enums;


/**
 * Created by peiji on 2017/4/4.
 */
public enum RoleEnum {
    admin(1,"admin"),
    developer(2,"developer"),
    clerk(3,"clerk");

    private int code;
    private String desc;

    RoleEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescByCode(int code){
        for (RoleEnum roleEnum : RoleEnum.values()){
            if(code ==roleEnum.getCode()){
                return roleEnum.desc;
            }
        }
        return "";
    }
}
