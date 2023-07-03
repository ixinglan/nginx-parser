# Nginx configuration Java parser
### Introduction
Fork from https://github.com/odiszapc/nginx-java-parser;

Parses Nginx configuration files with Antlr 4 grammar(upgrade to antlr4.12.0)
```xml
    <dependency>
        <groupId>org.antlr</groupId>
        <artifactId>antlr4-runtime</artifactId>
        <version>4.12.0</version>
    </dependency>
```

Fix some bugs:
- if block parse error
- comment parse error
- support remove if block
- support find if block
- ...

### Usage method
you can use by maven dependency
```xml
    <dependency>
        <groupId>io.github.ixinglan</groupId>
        <artifactId>nginx-parser</artifactId>
        <version>1.0.0</version>
    </dependency>
```
### Authors
zhaojq

### License
Apache 2.0
