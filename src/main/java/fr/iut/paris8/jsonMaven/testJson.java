package fr.iut.paris8.jsonMaven;

import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class testJson extends TestCase {
	
	@Test
	public void test()
	{
		JacksonJson jas = new JacksonJson();
		
		Warrior w1 = new Warrior();
		w1.setName("BOB");
		w1.setType("Blue");
		w1.setLife(100);
		w1.setArmorName("Red Dragon");
		w1.setArmorResist(200);
		w1.setWaponName("Excalibur");
		w1.setWaponDamage(250);
		
		String expected = "{\"name\":\"BOB\","
						+ "\"type\":\"Blue\","
						+ "\"life\":100,"
						+ "\"armorName\":\"Red Dragon\","
						+ "\"armorResist\":200,"
						+ "\"waponName\":\"Excalibur\","
						+ "\"waponDamage\":250}";
		
		Assert.assertEquals(expected,jas.convertObjToString(w1));
		
	}
	

}
