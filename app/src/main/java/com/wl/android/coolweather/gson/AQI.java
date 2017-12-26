package com.wl.android.coolweather.gson;

/**
 * Created by D22397 on 2017/12/26.
 * <p>
 * 和风天气返回的数据中的aqi部分的json数据对应的实体类：AQI -->当前空气质量的情况
 * 例："aqi":{
 *        "city":{
 *            "aqi":"44",
 *            "pm25":"13"
 *        }
 *      }
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi; // aqi指数

        public String pm25; // pm2.5指数
    }
}
