package org.nh.common.feign.user.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "用户基础信息")
public class UserBaseVo {

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "固定电话")
    private String telephone;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "备注")
    private String tips;
}