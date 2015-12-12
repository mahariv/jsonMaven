package fr.iut.paris8.jsonMaven;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonJson {
	public static void main()
	{
		Warrior w1 = new Warrior();
		w1.setName("BOB");
		w1.setType("Blue");
		w1.setLife(100);
		w1.setArmorName("Red Dragon");
		w1.setArmorResist(200);
		w1.setWaponName("Excalibur");
		w1.setWaponDamage(250);
		
		System.out.println(convertObjToString(w1));
	}
	
	public static String convertObjToString(Object obj)
	{
		ObjectMapper mapper = new ObjectMapper();
		String jsonToString="";
		try {
			jsonToString = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jsonToString);
		return jsonToString;
	}

}
