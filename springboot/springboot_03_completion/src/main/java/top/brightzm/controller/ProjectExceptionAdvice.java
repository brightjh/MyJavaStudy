package top.brightzm.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.brightzm.BusinessException;
import top.brightzm.SystemException;

/**
 * @description: 异常处理器
 * @author: bright
 * @time: 2022/11/15 下午8:22
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    /**
     * 业务层错误处理
     * @param ex
     * @return
     */
    @ExceptionHandler
    public Result doBusinessException(BusinessException ex){
        // 返回信息给用户
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    /**
     * 系统错误处理
     * @param ex
     * @return
     */
    @ExceptionHandler
    public Result doSystemException(SystemException ex){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员,ex对象发送给开发人员
        return new Result(ex.getCode(),null, ex.getMessage());
    }


    /**
     * 系统未知错误处理
     * @param ex
     * @return
     */
    @ExceptionHandler
    public Result doException(Exception ex){
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员,ex对象发送给开发人员
        return new Result(Code.SYSTEM_UNKNOWN_EX,null,"系统繁忙,请重试");
    }
}
