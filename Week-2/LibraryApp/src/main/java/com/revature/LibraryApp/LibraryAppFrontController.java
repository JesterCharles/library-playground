package com.revature.LibraryApp;


import io.javalin.Javalin;

public class LibraryAppFrontController {

    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hi Mom"))
                .get("/hello", ctx -> ctx.result("Hello World"))
                .start(7070);
    }
}