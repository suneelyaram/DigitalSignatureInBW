import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;


public class HashCode {

	protected String HashValue = "";

	protected String StringToHash = "";

	public void invoke(){
		//MessageDigest md;
		byte[] hash = null;
		try 
		{
			//md = MessageDigest.getInstance("SHA-256");
			//String text = String;
			//md.update(text.getBytes("UTF-8")); // Change this to "UTF-16" if needed
			//digest = md.digest();		
			

            MessageDigest digest = MessageDigest.getInstance("SHA-256"); 




            hash = digest.digest(StringToHash.getBytes("UTF-8")); 

			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashValue = hash.toString();
	}

	public String getHashValue() {
			return HashValue;
		}
	public void setHashValue(String val) {
			HashValue = val;
		}


	public String getStringToHash() {
			return StringToHash;
		}
	public void setStringToHash(String val) {
			StringToHash = val;
		}

	
}
