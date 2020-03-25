package tools;

import java.util.HashMap;
import java.util.Map;

/**
 * 学号姓名互查工具
 */
public class IdAndName {
    /**
     * 学号姓名映射字典
     */
    private static HashMap<Integer,String> idAndName;

    /**
     * 初始化学号姓名映射字典
     */
    static {
        // 初始化学号姓名映射字典
        idAndName = new HashMap<Integer, String>();
        // 为学号姓名映射字典赋值
        Initialize.initialize(idAndName);
    }

    /**
     * 由学号获取姓名
     * @param id 学号
     * @return 姓名(null为未找到)
     */
    public static String getNameById(int id) {
        // 获取并返回姓名
        return idAndName.get(id);
    }

    /**
     * 由姓名获取学号
     * @param name 姓名
     * @return 学号(0为未找到)
     */
    public static int getIdByName(String name) {
        // 迭代遍历所有键值对
        for (Map.Entry<Integer, String> entry : idAndName.entrySet()) {
            // 判断值是否等于给出的姓名
            if (entry.getValue().equals(name)) {
                // 返回找到的姓名
                return entry.getKey();
            }
        }
        // 未找到
        return 0;
    }
}
