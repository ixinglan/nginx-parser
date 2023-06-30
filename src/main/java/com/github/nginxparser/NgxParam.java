package com.github.nginxparser;

/**
 * Describes single line parameter. Examples:
 * user  nginx;
 * worker_processes  2;
 */
public class NgxParam extends NgxAbstractEntry {

    public String toString() {
        String s = super.toString();
        if (s.isEmpty())
            return s;

        return s + ";";
    }
}
