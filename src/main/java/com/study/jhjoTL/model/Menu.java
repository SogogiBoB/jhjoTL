package com.study.jhjoTL.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.Assert;

import javax.persistence.*;

@Getter
@Setter
public class Menu {

    private int gmenuId;
    private int smenuId;
    private String name;
    private String smenuName;

    public int getGmenuId() {
        return gmenuId;
    }

    public void setGmenuId(int gmenuId) {
        this.gmenuId = gmenuId;
    }

    public int getSmenuId() {
        return smenuId;
    }

    public void setSmenuId(int smenuId) {
        this.smenuId = smenuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSmenuName() {
        return smenuName;
    }

    public void setSmenuName(String smenuName) {
        this.smenuName = smenuName;
    }
}

