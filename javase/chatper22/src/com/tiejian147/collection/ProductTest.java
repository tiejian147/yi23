package com.cider.user;

import com.alibaba.fastjson.JSON;
import com.cider.common.rpc.model.RpcSkuRequestVO;
import com.cider.common.rpc.model.RpcSkuVO;
import com.cider.product.ProductApplication;
import com.cider.product.dao.TestDAO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author caojiancheng
 * @date 2020/8/21
 * @description
 */

@SpringBootTest(classes = ProductApplication.class)
@ActiveProfiles("dev")
public class ProductTest {

    @Resource
    private TestDAO testDAO;

    @Test
    void colorHandle() {
        List<Map<String,String>> list= testDAO.getColor();
        list.stream().filter(m->!m.get("name").equals("白色")&&!m.get("name").equals("蓝色")&&!m.get("name").equals("粉红色")).forEach(m->{
            System.out.println("INSERT INTO product_attr_info (product_attr_id, product_attr_info_name, product_attr_info_url)" +
                    " VALUES ( 1, '"+m.get("name")+"', '"+m.get("path")+"');");
        });
    }

    @Test
    void categoryHandle() {
        List<Map<String,Object>> list= testDAO.getParentCategory();
        Integer[] cid={3};
        list.stream().forEach(m->{
            System.out.println("INSERT INTO cc_cider.product_category (product_category_name, parent_id, sort, is_show, add_time, modify_time, modify_admin_id) " +
                    "VALUES ('"+m.get("type_name")+"', 0, 2, 1, '2020-08-11 09:39:14', null, null);");
            cid[0]=cid[0]+1;
            Integer parentId=cid[0];
            List<Map<String,Object>> list2= testDAO.getCategory((Integer) m.get("product_type_id"));
            list2.stream().forEach(m2->{
                System.out.println("INSERT INTO cc_cider.product_category (product_category_name, parent_id, sort, is_show, add_time, modify_time, modify_admin_id) " +
                        "VALUES ('"+m2.get("type_name")+"', "+parentId+", 2, 1, '2020-08-11 09:39:14', null, null);");
                cid[0]=cid[0]+1;
            });
        });
    }

    @Test
    void productHandle(){
        List<Map<String,Object>> allCategory= testDAO.getAllCategory();
        Map<String,String> yi23Category= allCategory.stream().collect(Collectors.toMap(m->m.get("product_type_id")+"",m->m.get("type_name")+""));
        Map<String,String> ciderCategory=new HashMap(){{
            put("上衣","4");
            put("T恤","5");
            put("衬衫","6");
            put("卫衣","7");
            put("毛衣/针织衫","8");
            put("大衣","9");
            put("夹克/外套","10");
            put("西服","11");
            put("中裤/短裤","12");
            put("半裙","13");
            put("连衣裙","14");
            put("连体裤","15");
            put("套装","16");
            put("羽绒服/棉服","17");
            put("风衣","18");
            put("背心/马甲","19");
            put("长裤","20");
            put("配饰","21");
            put("腰封","22");
            put("丝巾","23");
            put("围巾","24");
            put("帽子","25");
            put("腰带","26");
            put("挂饰","27");
            put("箱包","28");
            put("单肩包","29");
            put("腰包/胸包","30");
            put("手拿包","31");
            put("手提包","32");
            put("双肩包","33");
            put("化妆包","34");
            put("斜挎包","35");
            put("钱包/卡包","36");
            put("手机包","37");
            put("首饰","38");
            put("项链","39");
            put("手链","40");
            put("戒指","41");
            put("耳环","42");
            put("胸针","43");
            put("手镯","44");
            put("眼镜","45");
            put("太阳镜","46");
            put("平光镜","47");
            put("腕表","48");
            put("女表","49");
            put("男表","50");
            put("会员电商","51");
            put("礼服","52");
            put("女鞋","53");
            put("平底鞋","54");
            put("高跟鞋","55");
            put("中低跟鞋","56");
            put("休闲运动鞋","57");
            put("靴子","58");
            put("凉鞋","59");
            put("拖鞋","60");
            put("雨鞋","61");
            put("臻选汉服","62");
            put("时尚汉服","63");
            put("优选汉服","64");
            put("精品汉服","65");
        }};

        Map<Integer,String> colorMap=new HashMap(){{
            put(1,"http://tu.yi23.net/color/pink_3x.png");
            put(2,"http://tu.yi23.net/color/blue_3x.png");
            put(6,"http://tu.yi23.net/color/white_3x.png");
            put(7,"http://tu.yi23.net/color/orange_3x.png");
            put(8,"http://tu.yi23.net/color/ground_3x.png");
            put(9,"http://tu.yi23.net/color/animal_3x.png");
            put(10,"http://tu.yi23.net/color/multicolor_3x.png");
            put(11,"http://tu.yi23.net/color/black_3x.png");
            put(12,"http://tu.yi23.net/color/red_3x.png");
            put(13,"http://tu.yi23.net/color/yellow_3x.png");
            put(14,"http://tu.yi23.net/color/grey_3x.png");
            put(15,"http://tu.yi23.net/color/metal_3x.png");
            put(16,"http://tu.yi23.net/color/burgundy_3x.png");
            put(17,"http://tu.yi23.net/color/green_3x.png");
            put(18,"http://tu.yi23.net/color/fluorescent_3x.png");
            put(19,"http://tu.yi23.net/color/purple_3x.png");
        }};

        StringBuilder builder=new StringBuilder();
        List<Map<String,Object>> list= testDAO.getProduct();
        Integer[] pids={0};
        Integer[] psids={0};
        Integer[] ssids={0};
        list.stream().forEach(m->{
            builder.append("INSERT INTO cc_cider.product (product_name, is_alive, sale_time, season_id, product_category_top_id, product_category_second_id, add_time, modify_time, modify_admin_id, product_desc)" +
                    " VALUES ( '"+m.get("product_name")+"', 1, '2020-08-13 03:33:51', 1, "+ciderCategory.get(yi23Category.get(m.get("type_top_id")+""))+", "+ciderCategory.get(yi23Category.get(m.get("type_second_id")+""))+", '2020-08-13 03:34:15', null, null, '"+m.get("brand_profile")+"');");
            pids[0]=pids[0]+1;
            Integer pid=pids[0];
            List<Integer> colorList= IntStream.rangeClosed(1,19).filter(i->i!=3&&i!=4&&i!=5).mapToObj(Integer::valueOf).collect(Collectors.toList());
            Collections.shuffle(colorList);
            List<Integer> psidList=new ArrayList<>();
            List<Integer> ssidList=new ArrayList<>();
            Arrays.stream(m.get("picture").toString().split(",")).forEach(p->{
                p="http://yi23imgtest.oss-cn-beijing.aliyuncs.com/"+m.get("product_id")+"/"+p;
                int price= new Random().nextInt(500);
                Integer colorkey=colorList.get(0);
                builder.append("INSERT INTO cc_cider.product_style (product_id, product_image, product_thumb_image, product_style_image, add_time, modify_time, modify_admin_id, is_show, sort, product_style_attr, product_style_desc_attr, sale_price, original_price) " +
                        "VALUES ("+pid+", '"+p+",http://tu.yi23.net/Thumbs/"+m.get("thumb_pic")+"', '"+p+"', '"+colorMap.get(colorkey)+"', '2020-08-11 00:51:51', null, null, 1, 2, '"+colorkey+"', '46,47', "+ price +", "+price+new Random().nextInt(10)+");");
                colorList.remove(0);
                psids[0]=psids[0]+1;
                psidList.add(psids[0]);
            });

            IntStream.rangeClosed(3,4).forEach(i->{
                builder.append("INSERT INTO cc_cider.sku_style ( product_id, sku_style_desc, is_show, add_time, modify_time, modify_admin_id, sku_style_attr) " +
                        "VALUES ( "+pid+", '{\"Bust\":\"84cm\",\"Waist Size\":\"72cm\",\"Hip Size\":\"128cm\",\"Straps Length\":\"32cm\",\"Length\":\"109cm\"}', 1, '2020-08-13 08:27:57', null, null, '"+i+"');");
                ssids[0]=ssids[0]+1;
                ssidList.add(ssids[0]);
            });

            psidList.stream().forEach(psid->{
                ssidList.stream().forEach(ssid->{
                    builder.append("INSERT INTO cc_cider.sku_main (product_id, product_style_id, sale_stock, sort, add_time, modify_time, modify_admin_id, is_show, sku_style_id) " +
                            "VALUES ("+pid+", "+psid+", 5, 2, null, null, null, 1, "+ssid+");");
                });
            });

        });

        try {
            Files.write(Paths.get("aaaa.text"),builder.toString().getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
