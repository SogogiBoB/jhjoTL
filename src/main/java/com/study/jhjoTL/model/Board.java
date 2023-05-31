package com.study.jhjoTL.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "board")
@Getter
@Setter
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name= "frstRegistDate")
    private Date frstRegistDate;

    @Column(name = "updateDate")
    private Date updateDate;

    @Builder(builderClassName = "ByUidBuilder", builderMethodName = "BoardBuilder")
    public Board (int id, String title) {
        Assert.notNull(id, "id must not be null!!");
        Assert.notNull(title, "title must not be null!!");

        this.id = id;
        this.title = title;
    }
}

