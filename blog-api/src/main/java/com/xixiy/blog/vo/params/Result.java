package com.xixiy.blog.vo.params;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {

        private int code;

        private boolean success;

        private Object data;

        private String msg;

        public static Result success(Object data){
            return new Result(200,true,data,"success");
        }

        public static Result fail(int code, String msg){
            return new Result(code,false,null,msg);
        }

}
