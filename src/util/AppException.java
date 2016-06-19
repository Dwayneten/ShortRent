package util;

public class AppException extends Exception{
	private int exceptionCode;
	private String message;
	
	/**
	 *  ���췽���������쳣��Ϣ
	 *  
	 *	@param message �쳣��Ϣ 
	 */
	public AppException(String message){
		this.message = message;
	}
	
	/**
	 * 	���췽���������쳣��Ϣ���쳣���
	 * 
	 *	@param message �쳣��Ϣ 
	 *	@param exception �쳣���
	 */
	public AppException(String message, int exceptionCode){
		this.message = message ;
		this.exceptionCode = exceptionCode;
	}
	
	/**
	 * ��ȡ�쳣���
	 * 
	 * @return �쳣���
	 */
	public int getExceptionCode(){
		return exceptionCode;
	}
	
	/**
	 * ��ȡ�쳣��Ϣ
	 * 
	 * @return �쳣��Ϣ
	 */
	public String getMessage(){
		return message;
	}
	
	/**
	 * ��ȡ��ϸ���쳣��Ϣ
	 * 
	 * @return detailMessage
	 */
	public String getDetailMessage(){
		String detailMessage = "Detail message:" + exceptionCode + " " + message;
		return detailMessage;
	}
	
	
}
