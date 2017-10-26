import java.io.*;
class Cipher
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int key = 2;
		int ascii,len;
		System.out.println("\nEnter Plain Text: ");
		String s = br.readLine();
		len = s.length();
		System.out.print("\nPlain Text is: "+s+"\n");
		System.out.print("\nEncrypting Plain Text...");
		System.out.print("\nCipher Text is: ");
		for(int i=0;i<len;i++)
		{
			ascii = s.charAt(i);
			ascii = ascii+key;
			System.out.print(""+(char)ascii);			
			ascii = 0;
		}
		System.out.println();	
	}
}
