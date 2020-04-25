package com.xupt.read.controller.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xupt.read.model.Evaluate;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class EvaluateReq {

    @NotNull
    @Min(value = 1)
    @JsonProperty(value = "book_id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer bookId;

    @NotNull
    @Min(value = 1)
    @JsonProperty(value = "user_id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer userId;

    @NotBlank
    private String remarks;

    public static Evaluate convert(EvaluateReq req) {
        Evaluate evaluate = new Evaluate();
        BeanUtils.copyProperties(req, evaluate);
        return evaluate;
    }
}