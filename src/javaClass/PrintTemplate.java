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
            ArrayList<String> medicineName, ArrayList<String> jiliang, ArrayList<String> price,ArrayList<String> totalprice)
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
        return content.toString();
    }
}
