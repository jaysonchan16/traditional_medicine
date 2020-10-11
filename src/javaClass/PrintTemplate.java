/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import java.util.ArrayList;
/**
 *
 * @author Sheng
 */
public class PrintTemplate {
    
    public String printDiseasePatient(String IC, String ID, String name, String phone, String date, 
            String symptom, String category, String pulse, String tongueQuality, String tongueCoating, String shit, String history,
            String temperature, String bloodPressure, ArrayList<String> chufang, ArrayList<String> medicineCategory,
            ArrayList<String> medicineName, ArrayList<String> jiliang, ArrayList<String> price,ArrayList<String> totalprice, String totalweight, String mainprice)
    {
        StringBuilder content = new StringBuilder(); 
        content.append("IC: "+IC+"\t\t\t               ID: "+ID+"\n");
        content.append("姓名: "+name+"\n");
        content.append("电话号码: "+phone+"\t\t\t               日期: "+date+"\n");
        content.append("------------------------------------------------------------------------------------------------------------------------------\n");
        content.append("主症: "+symptom+"\t\t\t                    病症分类: "+category+"\n");
        content.append("脉象: "+pulse+"\t\t     舌质: "+tongueQuality+"\t\t     舌苔: "+tongueCoating+"\n");
        content.append("大小便: "+shit+"\t\t\t         病史: "+history+"\n");
        content.append("体温"+temperature+"\t\t\t          血压: "+bloodPressure+"\n");
        content.append("------------------------------------------------------------------------------------------------------------------------------\n");
        content.append("处方\t药物种类\t药物名称\t剂量\t价格/G\t总价值\n");
        content.append("------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i = 0; i<chufang.size(); i++)
        {
            content.append(chufang.get(i)+"\t"+medicineCategory.get(i)+"\t"+medicineName.get(i)+"\t"+jiliang.get(i)+"\t"+price.get(i)+"\t"+totalprice.get(i)+"\n");
        }
        content.append("------------------------------------------------------------------------------------------------------------------------------\n");
        content.append("\t\t\t"+totalweight+"\t\t"+mainprice+"\n");
        return content.toString();
    }
    
    public String printPatient(String ID, String IC, String name, String gender, String age, String phone, String address, String date)
    {
        StringBuilder content = new StringBuilder(); 
        if(!ID.equalsIgnoreCase(""))
        {
            content.append("ID: "+ID+"\n\n");
        }
        content.append("IC: "+IC+"\n\n");
        content.append("姓名: "+name+"\n\n");
        content.append("性别: "+gender+"\n\n");
        content.append("年龄: "+age+"\n\n");
        content.append("电话号码: "+phone+"\n\n");
        content.append("地址: "+address+"\n\n");
        content.append("日期: "+date+"\n\n");
        return content.toString();
    }

    public String printMedicine(String medicine, String Name, String component, String indication, String effect, String scoop, String weight, String cost, String price)
    {
        StringBuilder content = new StringBuilder(); 
        content.append("药: "+medicine+"\n\n");
        content.append("名字: "+Name+"\n\n");
        if(medicine.equalsIgnoreCase("单味药粉"))
        {
            content.append("药性: "+component+"\n\n");
            content.append("应用: "+indication+"\n\n");
        }
        else
        {
            content.append("组成: "+component+"\n\n");
            content.append("主治: "+indication+"\n\n");
        }
        content.append("功效: "+effect+"\n\n");
        content.append("每次每日分量: "+scoop+"\n\n");
        if(medicine.equalsIgnoreCase("单味药粉") || medicine.equalsIgnoreCase("复方药粉"))
        {
            content.append("重量: "+weight+"GM\n\n");
            content.append("本钱RM/GM: RM"+cost+"\n\n");
            content.append("价格RM/GM: RM"+price+"\n\n");
        }
        else if(medicine.equalsIgnoreCase("药丸"))
        {
            content.append("重量: "+weight+"'S\n\n");
            content.append("本钱RM/'S: RM"+cost+"\n\n");
            content.append("价格RM/'S: RM"+price+"\n\n");
        }
        else if(medicine.equalsIgnoreCase("药水"))
        {
            content.append("重量: "+weight+"'ML\n\n");
            content.append("本钱RM/10 ML: RM"+cost+"\n\n");
            content.append("价格RM/10 ML: RM"+price+"\n\n");
        }
        return content.toString();
    }
}
