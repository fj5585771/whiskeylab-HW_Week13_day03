package com.CCstudent.whiskey_lab.component;


import com.CCstudent.whiskey_lab.models.Distillery;
import com.CCstudent.whiskey_lab.models.Whiskey;
import com.CCstudent.whiskey_lab.repos.DistilleryRepository;
import com.CCstudent.whiskey_lab.repos.WhiskeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

        @Autowired
        DistilleryRepository distilleryRepository;

        @Autowired
        WhiskeyRepository whiskeyRepository;

        public DataLoader() {
        }

        public void run(ApplicationArguments args) {

            Distillery distillery1 = new Distillery("Glendronach", "Highland");
            distilleryRepository.save(distillery1);
            Whiskey Whiskey1 = new Whiskey("The Glendronach Revival", 15, 2018, distillery1);
            whiskeyRepository.save(Whiskey1);
            Distillery distillery2 = new Distillery("Rosebank", "Lowland");
            distilleryRepository.save(distillery2);
            Whiskey Whiskey2 = new Whiskey("The Rosebank 12 - Flora and Fona", 12, 1991, distillery2);
            whiskeyRepository.save(Whiskey2);
            Distillery distillery3 = new Distillery("Macallan", "Speyside");
            distilleryRepository.save(distillery3);
            Whiskey Whiskey3 = new Whiskey("The Macallan Anniversary Malt", 25, 1995, distillery3);
            whiskeyRepository.save(Whiskey3);
            Whiskey Whiskey4 = new Whiskey("The Glendronach Original", 12, 2018, distillery1);
            whiskeyRepository.save(Whiskey4);
            Distillery distillery4 = new Distillery("Balvenie", "Speyside");
            distilleryRepository.save(distillery4);
            Distillery distillery5 = new Distillery("Highland Park", "Island");
            distilleryRepository.save(distillery5);
            Whiskey Whiskey5 = new Whiskey("Viking Honour", 12, 2017, distillery5);
            whiskeyRepository.save(Whiskey5);
            Whiskey Whiskey6 = new Whiskey("Twist Tattoo", 16, 2019, distillery5);
            whiskeyRepository.save(Whiskey6);
            Distillery distillery6 = new Distillery("Old Pulteney", "Highland");
            distilleryRepository.save(distillery6);
            Whiskey Whiskey7 = new Whiskey("Old Pulteney 12", 12, 2018, distillery6);
            whiskeyRepository.save(Whiskey7);
            Whiskey Whiskey8 = new Whiskey("Old Pulteney 18", 18, 2018, distillery6);
            whiskeyRepository.save(Whiskey8);
            Distillery distillery7 = new Distillery("Blair Athol", "Highland");
            distilleryRepository.save(distillery7);
            Whiskey Whiskey9 = new Whiskey("Flora and Fauna", 12, 2020, distillery7);
            whiskeyRepository.save(Whiskey9);
            Whiskey Whiskey10 = new Whiskey("Lady of the Glen", 13, 2005, distillery7);
            whiskeyRepository.save(Whiskey10);
            Distillery distillery8 = new Distillery("Glenkinchie", "Lowland");
            distilleryRepository.save(distillery8);
            Whiskey Whiskey11 = new Whiskey("The Manager's Dram", 15, 2010, distillery8);
            whiskeyRepository.save(Whiskey11);
            Whiskey Whiskey12 = new Whiskey("Glenkinchie 10", 10, 1987, distillery8);
            whiskeyRepository.save(Whiskey12);
            Distillery distillery9 = new Distillery("Lagavulin", "Islay");
            distilleryRepository.save(distillery9);
            Whiskey Whiskey13 = new Whiskey("Lagavulin 16 Year Old", 16, 2014, distillery9);
            whiskeyRepository.save(Whiskey13);
            Whiskey Whiskey14 = new Whiskey("Lg10 - Elements of Islay" , 1, 2007, distillery9);
            whiskeyRepository.save(Whiskey14);
            Distillery distillery10 = new Distillery("Laphroaig", "Islay");
            distilleryRepository.save(distillery10);
            Whiskey Whiskey15 = new Whiskey("Lagavulin 16 Year Old", 16, 2014, distillery8);
            whiskeyRepository.save(Whiskey15);
            Whiskey Whiskey16 = new Whiskey("Lg10 - Elements of Islay" , 1, 2007, distillery7);
            whiskeyRepository.save(Whiskey16);
            Distillery distillery11 = new Distillery("Talisker", "Island");
            distilleryRepository.save(distillery11);
            Whiskey Whiskey17 = new Whiskey("57° North", 1, 2014, distillery11);
            whiskeyRepository.save(Whiskey17);
            Whiskey Whiskey18 = new Whiskey("Skye" , 1, 2015, distillery11);
            whiskeyRepository.save(Whiskey18);
            Distillery distillery12 = new Distillery("Isle of Arran","Island" );
            distilleryRepository.save(distillery12);
            Whiskey Whiskey19 = new Whiskey("Caskstrength and Carry On", 13, 2011, distillery12);
            whiskeyRepository.save(Whiskey19);
            Whiskey Whiskey20 = new Whiskey("Seven Wood" , 1, 2018, distillery12);
            whiskeyRepository.save(Whiskey20);
            Distillery distillery13 = new Distillery("The Glenlivet","Speyside" );
            distilleryRepository.save(distillery13);
            Whiskey Whiskey21 = new Whiskey("Founder's Reserve", 12, 2014, distillery13);
            whiskeyRepository.save(Whiskey21);
            Whiskey Whiskey22 = new Whiskey("Carmaferg" , 18, 2018, distillery13);
            whiskeyRepository.save(Whiskey22);
        }
}
