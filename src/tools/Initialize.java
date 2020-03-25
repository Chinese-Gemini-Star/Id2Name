package tools;

import java.util.HashMap;

/**
 * 初始化学号姓名映射字典
 */
public class Initialize {
    /**
     * 姓名集
     */
    private static String[] name = {"陈相宜","周想","程佳钰","夏启贤","蔡程昊哲","吴雨涵","陆苏于","戴亮","沈佳烨","上官杨旭","孟嘉","朱希泽","吴于馨","项楠","龚馨乐","施明杰","李欣怡","年泽","孙淑悦","蔡浩然","龚睿","周心怡","孔渝囡","何雅茹","俞力泰","张博一","潘芷涵","何陆烨欣","董皓鹏","丁杭琦","顾铭","吴迪","韦骁峰","金雯菲","傅恒喆","马绮蔓","程诗奕","鲍佳宜","童淑琴","顾懿炜","翁熠骁","张海涛","胡玉婷","张烨","蒋乐航","王笛伊"};

    /**
     * 初始化学号姓名映射字典
     * @param hashMap 学号姓名映射字典
     */
    public static void initialize(HashMap<Integer, String> hashMap){
        // 遍历姓名集
        for(int i = 0; i < name.length; i++) {
            //写学号和姓名入学号姓名映射字典
            hashMap.put(i + 1, name[i]);
        }
    }
}
