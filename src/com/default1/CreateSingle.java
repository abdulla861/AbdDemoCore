package com.default1;

public class CreateSingle{

private static CreateSingle crtSingle = null;

private CreateSingle(){
}

public static CreateSingle getInstance(){

	if(crtSingle == null){
		crtSingle = new CreateSingle();
	}
	
	return crtSingle;
}

}