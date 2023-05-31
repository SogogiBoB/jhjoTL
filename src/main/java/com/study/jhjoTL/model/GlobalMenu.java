package com.study.jhjoTL.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "GlobalMenu")
@Getter
@Setter
@NoArgsConstructor
public class GlobalMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gmenuId;

    @Column(name = "name")
    private String gmenuName;


    @Builder(builderClassName = "ByUidBuilder", builderMethodName = "BoardBuilder")
    public GlobalMenu(int gmenuId, String gmenuName) {
        Assert.notNull(gmenuId, "id must not be null!!");
        Assert.notNull(gmenuName, "title must not be null!!");

        this.gmenuId = gmenuId;
        this.gmenuName = gmenuName;
    }
}

