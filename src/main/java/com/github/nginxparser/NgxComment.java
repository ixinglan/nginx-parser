package com.github.nginxparser;

/**
 * Comment. Example:
 * # Bla bla
 */
public class NgxComment extends NgxAbstractEntry {

    public NgxComment(String comment) {
        getTokens().add(new NgxToken(comment.substring(1)));
    }

    @Override
    public String getValue() {
        return getName();
    }

    public String toString() {
        return "#" + getValue();
    }
}
