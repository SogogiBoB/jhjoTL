package com.study.jhjoTL.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SubMenu")
@Getter
@Setter
@NoArgsConstructor
public class SubMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int smenuId;

    @Column(name = "smenuName")
    private String smenuName;

    @Column(name = "gmenuId")
    private int gmenuId;

    @Builder(builderClassName = "ByUidBuilder", builderMethodName = "BoardBuilder")
    public SubMenu(int smenuId, String smenuName) {
        Assert.notNull(smenuId, "id must not be null!!");
        Assert.notNull(smenuName, "title must not be null!!");

        this.smenuId = smenuId;
        this.smenuName = smenuName;
    }
}

