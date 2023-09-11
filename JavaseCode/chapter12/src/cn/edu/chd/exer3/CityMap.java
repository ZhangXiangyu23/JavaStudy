package cn.edu.chd.exer3;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:CityMap
 * Description:
 *
 * @Author 张翔宇
 * @Create 2023/9/11 16:08
 */
public class CityMap {
    //hashmap
    public static Map model = new HashMap();

    static {
        //将K-V放入到hashmap中
        model.put("北京", new String[]{"北京"});
        model.put("辽宁", new String[]{"沈阳", "盘锦"});
        model.put("吉林", new String[]{"长春", "延边"});
        model.put("河北", new String[]{"承德", "石家庄", "唐山"});
        model.put("河南", new String[]{"郑州", "许昌"});
        model.put("山东", new String[]{"济南", "青岛", "日照"});

    }
}
