package assgin;

import java.util.List;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Op 
{
	
	public static void fetch_temp(String s)
	{
		RestAssured.baseURI="https://samples.openweathermap.org/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22\";");
		
		JsonPath jsonPath = res.jsonPath();
		List<String> l = jsonPath.getList("list.dt_txt");
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).equals(s))
			{
				Object temp=jsonPath.get("list["+i+"].main.temp");
				System.out.println("temp is:"+temp);
			}
		}
	}
	public static void fetch_pressure(String s)
	{
		RestAssured.baseURI="https://samples.openweathermap.org/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22\";");
		
		JsonPath jsonPath = res.jsonPath();
		List<String> l = jsonPath.getList("list.dt_txt");
		for(int i=0;i<l.size();i++)
		{
			
			if(l.get(i).equals(s))
			{
				Object pressure=jsonPath.get("list["+i+"].main.pressure");
				System.out.println("pressure is:"+pressure);
			}
		}
	}
	public static void fetch_wind(String s)
	{
		RestAssured.baseURI="https://samples.openweathermap.org/";
		RequestSpecification r = RestAssured.given();
		Response res = r.request(Method.GET,"/data/2.5/forecast/hourly?q=London,us&appid=b6907d289e10d714a6e88b30761fae22\";");
		
		JsonPath jsonPath = res.jsonPath();
		List<String> l = jsonPath.getList("list.dt_txt");
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).equals(s))
			{
				Object speed=jsonPath.get("list["+i+"].wind.speed");
				System.out.println("wind is:"+speed);
			}

		}
	}
}
