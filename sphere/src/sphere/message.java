package sphere;
public class message {
	String sender;
	String message;
	String time;
	//hi i am one
	message(String a, String b, String c)
	{//Constructor 1
		sender=a;
		message=b;
		time=c;
	}
	message(String a, String b)
	{//Constructor 2
		sender=a;
		message=b;
	}
	message(String a)
	{//Constructor 3
		sender=a;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
