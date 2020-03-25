package app;

import tools.IdAndName;

import java.util.Scanner;

/**
 * 主程序
 */
public class MainApp {
    /**
     * 主方法
     * @param args 运行参数
     */
    public static void main(String[] args) {
        System.out.println("程序开始,本程序可进行学号和姓名互查,输入exit可退出本程序!");
        Scanner scanner = new Scanner(System.in);// 控制台输入流
        while (true) {// 循环执行
            System.out.print("请输入学号或姓名:");// 提示输入
            String inputWord = scanner.nextLine();// 获取输入
            if (inputWord.equals("exit")) {
                // 退出程序
                System.out.println("程序退出,感谢您的使用!");
                return;
            } else if (inputWord.matches("[0-9]+")) {
                // 为学号,查询姓名,并输出
                String name = IdAndName.getNameById(Integer.parseInt(inputWord));// 转化为姓名
                System.out.println(name != null ? name : "查无此人");// 输出结果
            } else {
                // 为姓名,查询学号,并输出
                int id = IdAndName.getIdByName(inputWord);// 转化为学号
                System.out.println(id != 0 ? id : "查无此人");// 输出结果
            }
        }
    }
}
