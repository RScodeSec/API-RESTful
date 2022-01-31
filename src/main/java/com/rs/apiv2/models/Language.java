package com.rs.apiv2.models;

import javax.persistence.*;

@Entity
@Table(name = "progra_leng")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    private String name;
    private String launch;
    private boolean strong_typing;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public boolean isStrong_typing() {
        return strong_typing;
    }

    public void setStrong_typing(boolean strong_typing) {
        this.strong_typing = strong_typing;
    }
}
