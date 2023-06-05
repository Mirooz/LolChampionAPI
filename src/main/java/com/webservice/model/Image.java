package com.webservice.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "image")
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "sprite")
    private String sprite;

    @Column(name = "groupname")
    private String groupname;

    @Column(name = "x")
    private Long x;

    @Column(name = "y")
    private Long y;

    @Column(name = "w")
    private Long w;

    @Column(name = "h")
    private Long h;

}
