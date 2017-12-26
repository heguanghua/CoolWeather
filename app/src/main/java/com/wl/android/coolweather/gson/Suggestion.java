package com.wl.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by D22397 on 2017/12/26.
 * <p>
 * 和风天气返回的数据中的suggestion部分的json数据对应的实体类：Suggestion --> 一些天气相关的生活建议信息
 * 例："suggestion":{
 *         "comf":{
 *             "txt":"白天虽然天气晴好，但早晚会感觉偏凉，午后舒适、宜人。"
 *         },
 *         "cw":{
 *             "txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"
 *         },
 *         "sport":{
 *             "txt":"天气较好，但考虑风力较强且气温较低，推荐您进行室内运动，若在户外运动注意防风并适当增减衣物。"
 *         }
 *     }
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort; // 舒适度

    @SerializedName("cw")
    public CarWash carWash; // 洗车指数

    public Sport sport; // 运动建议

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
