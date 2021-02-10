package com.CCstudent.whiskey_lab;

import com.CCstudent.whiskey_lab.models.Distillery;
import com.CCstudent.whiskey_lab.models.Whiskey;
import com.CCstudent.whiskey_lab.repos.DistilleryRepository;
import com.CCstudent.whiskey_lab.repos.WhiskeyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureTestDatabase
@SpringBootTest
class WhiskeyLabApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskeyRepository whiskeyRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateDistilleryAndWhiskey(){
		Distillery distillery = new Distillery("Speyside Distillery", "Speyside");
		distilleryRepository.save(distillery);

		Whiskey whiskey = new Whiskey("GOld Label", 2018, 2, distillery);
		whiskeyRepository.save(whiskey);
	}

	@Test
	public void canFindWhiskeyOver2000(){
		List<Whiskey> foundWhiskeys = whiskeyRepository.findByYearGreaterThan(20);
		assertEquals(1, foundWhiskeys.size());
	}

}
