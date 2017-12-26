package com.wl.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by D22397 on 2017/12/26.
 * <p>
 * 和风天气返回的数据中的daily_forecast部分的json数据包含一个数组，定义未来一天的单日天气对应的实体类：Forecast
 * daily_forecast --> 未来几天的天气信息
 * 例："daily_forecast":[
 *          {
 *              "date":"2016-08-08",
 *              "cond":{
 *                  txt_d:"阵雨"
 *              },
 *              "tmp":{
 *                  "max":"34",
 *                  "min":"27"
 *              }
 *          },
 *          {
 *              "date":"2016-08-09",
 *              "cond":{
 *                  txt_d:"多云"
 *              },
 *              "tmp":{
 *                  "max":"35",
 *                  "min":"29"
 *              }
 *          },
 *          ...
 *      ]
 */

public class Forecast {

    public String date; // 未来某天日期

    @SerializedName("cond")
    public More more; // 未来某天天气概况

    @SerializedName("tmp")
    public Temperature temperature; // 未来某天气温

    public class More {

        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {

        public String max; // 最高气温

        public String min; // 最低气温
    }

}
