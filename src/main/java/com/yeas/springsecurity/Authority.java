package com.yeas.springsecurity;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
    /**
     *
     */
    private static final long serialVersionUID = 1197496125064094855L;
    private String authority;

    public Authority(String authority){
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

}