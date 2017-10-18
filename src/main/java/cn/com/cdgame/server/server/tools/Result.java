package cn.com.cdgame.server.server.tools;

import com.google.gson.Gson;

/**
 * 作者：陈东  —  www.renwey.com
 * 日期：2017/10/18 - 上午11:47
 * 注释：
 */
public class Result<D> {

    private static final Gson sGson = new Gson();

    private int code;
    private String msg;
    private D data;

    private String toJson() {
        return sGson.toJson(this);
    }

    public  static <D> String create(int code, String msg, D data) {
        Result<D> result = new Result<>();
        result.code = code;
        result.msg = msg;
        result.data = data;
        return result.toJson();
    }
}
