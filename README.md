# CoolWeather
一款功能较完善的天气预报应用

具备以下功能：
	（1）可以罗列出全国所有的省、市、县；
	（2）可以查看全国任意城市的天气信息；
	（3）可以自由地切换城市，去查看其它城市的天气；
	（4）提供手动更新以及后台自动贡献天气的功能。

服务器接口：
	http://guolin.tech/api/china 列出中国所有的省份
	http://guolin.tech/api/china/16 列出该id所属省份的所有市（16是江苏省）
	http://guolin.tech/api/china/16/116 列出该id所属市的所有县（116是苏州），县级的信息包含weather_id，用于查询天气
	
	使用和风天气获取任意城市的天气信息
	http://guolin.tech/api/weather?cityid=" + weatherId + "&key=28c01281607a4a9b92195626fb49a4a1" （个人申请的和风天气账号对应的key）
	
	今日的必应背景图链接
	http://guolin.tech/api/bing_pic