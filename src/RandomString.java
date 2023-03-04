// Java program generate a random AlphaNumeric String
// using Math.random() method

public class RandomString {

// function to generate a random string of length n
static String getAlphaNumericString(int n)
{

// choose a Character random from this String
String AlphaNumericString = "AR"
		+ "0123456789";

// create StringBuffer size of AlphaNumericString
StringBuilder sb = new StringBuilder(n);

for (int i = 0; i < n; i++) {

// generate a random number between
// 0 to AlphaNumericString variable length
int index
	= (int)(AlphaNumericString.length()
	* Math.random());

// add Character one by one in end of sb
sb.append(AlphaNumericString
	.charAt(index));

}
sb.append("AR");
return sb.toString();
}

public static void main(String[] args)
{

// Get the size n
int n = 4;

// Get and display the alphanumeric string
System.out.println(RandomString
	.getAlphaNumericString(n));
}
}
