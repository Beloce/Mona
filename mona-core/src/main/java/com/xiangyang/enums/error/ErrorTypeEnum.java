package com.xiangyang.enums.error;

import com.xiangyang.enums.QuestionLevelEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peiji on 2017/1/31.
 * 错误状态种类
 */
public enum ErrorTypeEnum {
    Urgent(1,"紧急"),
    Bug(2,"一般性bug"),
    Advice(3,"意见与建议"),
    Doubt(4,"疑问"),;

    private Integer code;
    private String desc;

    ErrorTypeEnum(Integer code, String desc){
        this.code=code;
        this.desc=desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 获取该枚举类的所有类型
     * @return  Map<Integer,String>
     */
    public static Map<Integer,String> getErrorTypeList(){
        Map<Integer,String> ErrorTypeMap = new HashMap<Integer,String>();
        for(ErrorTypeEnum entity : ErrorTypeEnum.values()){
            ErrorTypeMap.put(entity.getCode(),entity.getDesc());
        }
        return ErrorTypeMap;
    }

    /**
     * 根据code获取描述
     * @param code
     * @return
     */
    public static String getDescByCode(Integer code){
        for(ErrorTypeEnum errorTypeEnum : ErrorTypeEnum.values()){
            if(code.equals(errorTypeEnum.getCode())){
                return errorTypeEnum.getDesc();
            }
        }
        return "";
    }
}
