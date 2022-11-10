package com.HiO.Backend.server.common.dto;

public class ResponseDtoREST {

    public static class Method {
        public static String GET = "GET";
        public static String POST = "POST";
        public static String PATCH = "PATCH";
        public static String PUT = "PUT";
        public static String DELETE = "DELETE";
    }

    public static class Status {
        public static int OK = 200;
        public static int BAD_REQUEST = 400;
        public static int NOT_FOUND = 404;
    }
}
