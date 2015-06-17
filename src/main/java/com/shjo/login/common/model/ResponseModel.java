package com.shjo.login.common.model;


public class ResponseModel {
	private Header header = new Header();
	private Object date = null;
    
    public ResponseModel() {
        header.isSuccessful = true;
        header.resultCode = 0;
        header.resultMessage = "SUCCESS";
    }
    
	class Header {
        public Boolean isSuccessful;
        public Integer resultCode;
        public String resultMessage;
    }
}
