package com.zs.study.company.service;
import com.zs.study.company.JavaStack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
//
@Slf4j
@Service
public class CompanyServiceimpl implements CompanyService{

    @Override
    public void isValidString(){
        try {
            boolean bool = JavaStack.isValid("(({{}))({{");
            log.info(String.valueOf(bool));
            System.out.println("------------" + bool);
        }catch (NullPointerException e){
            log.error(e.getMessage());
        }
    }
}
