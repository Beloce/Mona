package com.xiangyang.form.error;

import com.xiangyang.form.PageForm;
import com.xiangyang.model.UserDO;
import lombok.Data;

import java.util.List;

/**
 * Created by peiji on 2017/2/21.
 */
@Data
public class QueryErrorForm extends PageForm {
    private Integer errorSource;

    private Integer errorType;

    private Long productId;

    private Integer status;

    private List<Integer> statusList;

    private Long providerId;

    private int recordNum;

}
