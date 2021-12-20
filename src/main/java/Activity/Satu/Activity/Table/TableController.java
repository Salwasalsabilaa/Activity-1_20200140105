/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity.Satu.Activity.Table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Inspiron
 */
@Controller
public class TableController {
    @RequestMapping("/dataktp")
    //@ResponseBody
    
    public String getTable(Model ktp){
        ArrayList<List<String>> DataKTP = new ArrayList<>();
                
        DataKTP.add(Arrays.asList("ID", "Nomor KTP", "Nama", "Alamat"));
        DataKTP.add(Arrays.asList("01", "011101", "Yeonjun", "Seoul"));
        DataKTP.add(Arrays.asList("02", "011102", "Soobin", "Busan"));
        DataKTP.add(Arrays.asList("03", "011103", "Beomgyu", "Gangnam"));
        DataKTP.add(Arrays.asList("04", "011104", "Tehyun", "Jakarta"));
        DataKTP.add(Arrays.asList("05", "011105", "HueningKai", "Surabaya"));
        DataKTP.add(Arrays.asList("06", "011106", "Jungwon", "Medan"));
        DataKTP.add(Arrays.asList("07", "011107", "Heesung", "Yogyakarta"));
        DataKTP.add(Arrays.asList("08", "011108", "Jay", "Banjarmasin"));
        DataKTP.add(Arrays.asList("09", "011109", "Jake", "Hongkong"));
        DataKTP.add(Arrays.asList("10", "011110", "Sunghoon", "Seoul"));
        DataKTP.add(Arrays.asList("11", "011111", "Sunoo", "Yogyakarta"));
        DataKTP.add(Arrays.asList("12", "011112", "Niki", "Palembang"));
        DataKTP.add(Arrays.asList("13", "011113", "Joshua", "Jakarta"));
        DataKTP.add(Arrays.asList("14", "011114", "Lisa", "New York"));
        DataKTP.add(Arrays.asList("15", "011115", "Jennie", "Bantul"));
        DataKTP.add(Arrays.asList("16", "011116", "Rose", "Bangkok"));
        DataKTP.add(Arrays.asList("17", "011117", "Jisoo", "Tokyo"));
        DataKTP.add(Arrays.asList("18", "011118", "Sakura", "Seoul"));
        DataKTP.add(Arrays.asList("19", "011119", "Minju", "Surabaya"));
        DataKTP.add(Arrays.asList("20", "011120", "Mark", "Los Angeles"));
        
        
        ktp.addAttribute("ktp", DataKTP);
        
        return "tableViewer";
    }
    
}
