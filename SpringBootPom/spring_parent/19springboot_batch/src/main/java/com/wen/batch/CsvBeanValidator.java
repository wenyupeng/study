package com.wen.batch;


import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;
import org.springframework.beans.factory.InitializingBean;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 *
 * @Author: wen
 * @Date: 2019/6/19 23:59
 */
public class CsvBeanValidator<T> implements Validator<T>, InitializingBean {

    private javax.validation.Validator validator;

    @Override
    public void validate(T value) throws ValidationException {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(value);
        if (constraintViolations.size()>0){
            StringBuilder message = new StringBuilder();
            for (ConstraintViolation constrainViolation: constraintViolations) {
                message.append(constrainViolation.getMessage()+"\n");
            }
            throw new ValidationException(message.toString());
        }
    }

    /**
     * JSR-303的Validator校验数据，完成初始化
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.usingContext().getValidator();
    }
}
