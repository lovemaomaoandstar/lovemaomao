package com.zs.study.day.dayOne;

import java.io.Serializable;

/**
* @Description:    多构造器写法
* @Author:         zs
* @CreateDate:     2019/4/15 12:59
* @UpdateRemark:   修改内容
* @Version:        1.0
 * 多属性类使用构造器Model
*/
public class ManyAttrDTO implements Serializable {
    public int getAttrOne() {
        return attrOne;
    }

    public void setAttrOne(int attrOne) {
        this.attrOne = attrOne;
    }

    public int getAttrTwo() {
        return attrTwo;
    }

    public void setAttrTwo(int attrTwo) {
        this.attrTwo = attrTwo;
    }

    public Object getAttrThree() {
        return attrThree;
    }

    public void setAttrThree(Object attrThree) {
        this.attrThree = attrThree;
    }

    private static final long serialVersionUID = 7686226115372606776L;
    private int attrOne;
    private int attrTwo;
    private Object attrThree;
    public ManyAttrDTO(int attrOne,int attrTwo,Object attrThree){
        this.attrOne=attrOne;
        this.attrTwo=attrTwo;
        this.attrThree=attrThree;
    }
    public static ManyAttrDTO CreateManyAttrDTO(int attrOne){
        return ManyAttrDTO.CreateManyAttrDTO(attrOne,0);
    }
    public static ManyAttrDTO CreateManyAttrDTO(int attrOne,int attrTwo){
        return ManyAttrDTO.CreateManyAttrDTO(attrOne,attrTwo,(Object) null);
    }
    public static ManyAttrDTO CreateManyAttrDTO(int attrOne,int attrTwo,Object attrThree){
        return new ManyAttrDTO(attrOne,attrTwo,attrThree);
    }

}
