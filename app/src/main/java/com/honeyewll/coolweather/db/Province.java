package com.honeyewll.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jackie on 2017/9/13.
 */
public class Province extends DataSupport {
    private int id ;
    private String provinceName ;       //记录省的名字
    private String provinceCode ;       //记录省的代号

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
