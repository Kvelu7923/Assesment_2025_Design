package api_tests;

import api.config.ConfigManager;
import api.utils.APIUtils;
import io.restassured.response.Response;

public class CRUD_BasicAut {
	
	String username = ConfigManager.getProperty("username");
	
	String clientid = ConfigManager.getProperty("client_id");
	
	String sys_id ;
	
	String table = ConfigManager.getProperty("tablename");
	
	
	String password = ConfigManager.getProperty("password");

	public static void main(String[] args) {
		
		CRUD_BasicAut cRUD_BasicAut=new CRUD_BasicAut();
		cRUD_BasicAut.post();
		
			
		}
	
	public void post(){
		// 🔹 Create a Resource (POST)
		Response postResponse = APIUtils.sendPostWithBasicAuth(table, username, password,
				"{\r\n" + "    \"short_description\": \"My laptop problem\"\r\n" + "}");
		// Modify the body as needed
		System.out.println("🟢  POST Response: 🟢");
		postResponse.prettyPrint();
		
	}
		

		
		
		
		
		
		
	}


