package com.lyoyang.springbootstart.utils;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 相应码：9 - 未知异常 0-失败 1-成功 2-会话超时 3-安全拦截
 *
 * 相应码定义类型：
 * 6位: 3 位 交易类型，3 位具体错误
 * 000 - 登录相关模块功能
 * 001 - 用户、、
 * 002 - 角色
 * 003 - 权限
 * 004 - 代付
 * 005 - 应用中心相关
 * 999 - 公共参数校验（短信验证码、图片验证码等）
 * 统一 定义常用错误提示 ；放假回来整理
 *
 *
 *
 * Created with IntelliJ IDEA.
 * User: benyamin
 * Date: 16-9-29
 * Time: 下午4:29
 * To change this template use File | Settings | File Templates.
 */
@AllArgsConstructor
public enum MvcMessage {
    //商户模式
    ADD_SUCCESS("1","新增成功"),
    ADD_FAILURE("2","新增失败"),
    WZ("3","未知"),
    //商户授权
    AUTHORIZATION_SUCCESS("0","授权成功"),
    AUTHORIZATION_FAILURE("1","授权失败"),

    CODE_UNKNOWN("9", "系统未知异常"),
    CODE_SUCCESS("0", "交易成功"),
    CODE_FAILURE("1", "交易失败"),


    CODE_FAILURE_SESSION_TIMEOUT("2", "会话超时"),
    CODE_FAILURE_NO_PERMISSION("3", "安全拦截"),
    CODE_FAILURE_NO_MOD_PWD("3", "首次登录,请修改密码"),
    CODE_FAILURE_PWD_EXPIRED("3", "密码过期，请求修改密码"),



    /** 批量 */
    CODE_SUCCESS_005021("0", "成功"),


    /** 批量入住、签约*/
    CODE_FAILURE_005022("1", "文件为空，请选择文件上传！"),
    CODE_FAILURE_005023("1", "文件格式不正确，请上传xlsx或者xls类型文件"),
    CODE_FAILURE_005024("1", "文件名超长，不能大于28"),
    CODE_FAILURE_005026("1","文件中不能有超链接"),
    CODE_FAILURE_005027("1", "不存在该文件"),
    CODE_FAILURE_005028("1", "没有对应类型的文件"),
    CODE_FAILURE_005029("1", "正在生成文件，请稍等"),

    /** 查询批量入住的数据*/
    CODE_FAILURE_005025("0", "没有数据！"),

    /** 商户管理*/
    CODE_QUERY_SUCCESS("0","查询成功"),
    CODE_QUERY_SUCCESS_NO_DATA("0","没有数据"),
    CODE_REAL_STATUS_SUCCESS1("0","实名成功"),
    CODE_REAL_STATUS_SUCCESS2("0","实名驳回成功"),
    CODE_REAL_STATUS_FAILURE("1","实名失败"),
    CODE_UPDATE_SUCCESS("0","商户信息修改成功"),
    CODE_UPDATE_FAILURE("1","商户信息修改失败"),
    CODE_UPDATE_MANAGER_SUCCESS("0","编辑负责人成功"),
    CODE_UPDATE_MANAGER_FAILURE("1","编辑负责人失败"),
    CODE_ENABLE_SUCCESS("0","商户状态编辑成功"),
    CODE_ENABLE_FAILURE("1","商户状态编辑失败"),
    CODE_SYN_AGGPLAT_FAILURE("1","商户同步聚合2.0失败"),
    CODE_SYN_MERCHANT_FAILURE("1","商户同步老商户中心失败" ),
    CODE_FORMAT_CHECK_FAILURE("1","数据格式校验失败" ),
    CODE_MERCHANT_CHECK_FAILURE("1","商户信息校验失败" ),
    CODE_REGISTER_FAILURE("0","商户入驻失败"),
    CODE_DOWNLOAD_REGISTER_TEMLPET_FAILURE("1","模板不存在"),
    CODE_DOWNLOAD_DEATIL_FAILURE("1","商户入驻详情不存在"),
    CODE_REGISTER_SUCCESS("0","商户入驻成功"),
    CODE_RESET_USER_NAME_SUCCESS("0","修改用户名/密码成功"),
    CODE_INSERT_FAIL_EXIST("1","新增失败，该商户已配置机构号！"),


    /** 鉴权短信服务*/
    CODE_ERROR("0", "系统异常"),

    INTERNAL_QUERY_SUCCESS("0", "查询成功"),
    INTERNAL_QUERY_FAILURE("1", "查询失败"),
    INTERNAL_MOD_SUCCESS("0", "修改成功"),
    INTERNAL_MOD_FAILURE("1", "修改失败"),
    INTERNAL_ADD_SUCCESS("0", "新增成功"),
    INTERNAL_ADD_FAILURE("1", "新增失败"),

    /** 跨境模块 Begin*/

    /*商户设备渠道管理*/
    INSERT_FAIL_RATE_CONFIG_EXIST("1","新增失败，与已存在币种费率不一致，请检查！"),
    INSERT_FAIL_RATE_AMOUNT_EXIST("1","新增失败，商户限额配置信息已存在！"),

    /*支付参数管理*/
    MOBILE_ALIPAY_PARAMS_ERROR("1","新增失败，渠道为支付宝且设备为手机时必须配置公私钥"),

    /** 文件中心*/
    CODE_FAILURE_FILE_NOT_EXIST("1","文件不存在"),

    /*计费中心模块*/
    CODE_FAILURE_FILENAME_LENGTH("1","文件名称长度 不等于14"),

    CODE_FAIL_ADD_ATTACH("1","新增微信保留域失败"),


    /** 跨境模块 End*/

    /** 计费中心 批量配置*/
    CODE_FAILURE_FAIL_EMP_NO("1", "错误的员工编号"),
    CODE_FAILURE_FAIL_DATE("1", "错误的日期字符串"),
    CODE_FAILURE_FAIL_BATCH_NO("1", "错误的批次号"),
    CODE_FAILURE_FAIL_LENGTH("1", "文件名长度不符合14"),

    CODE_FAILURE_WX_DIRECT("1", "微信进件异常！"),
    CODE_FAILURE_WX_DIRECT_UPDATE("1", "微信进件修改！"),

    CODE_FAILURE_ADD_UNION_SCAN("1", "新增银联扫码路由"),

    SCAN_CARD_CONFIG_SUCCESS("0", "配置成功"),
    SCAN_CARD_CONFIG_FAIL("1", "配置失败"),

    AUDIT_SUCCESS("0", "审核成功"),
    AUDIT_FAIL("1", "审核失败"),

    VERIFY_SUCCESS("0", "验证用户密码成功"),
    VERIFY_FAIL("1", "验证用户密码失败"),

    UPLOAD_SUCCESS("0", "上传成功"),
    UPLOAD_FAIL("1", "上传失败"),


    SEND_MESSAGE_SUCCESS("0", "发送成功"),
    SEND_MESSAGE_FAIL("1", "发送失败"),

    TEMP_ERROR("", "");////这个必须要留着;

    public static MvcMessage buildUserDefinedEnum(String errorMsg) {
        MvcMessage tempEnum = TEMP_ERROR;
        tempEnum.setCode("1");
        tempEnum.setDesc(errorMsg);
        return tempEnum;
    }

    public static MvcMessage buildUserDefinedEnum(String errorCode,String errorMsg) {
        MvcMessage tempEnum = TEMP_ERROR;
        tempEnum.setCode(errorCode);
        tempEnum.setDesc(errorMsg);
        return tempEnum;
    }

    @Getter
    String code;
    @Getter
    String desc;

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
