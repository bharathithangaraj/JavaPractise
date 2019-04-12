import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class PSEmail {
	
	public static void main(String args[]) {
		
	}
	
	  Properties props = null;
	StringWriter sw = new StringWriter();
	PrintWriter pw = new PrintWriter(sw);
	String exceptionAsString = "";

	

	public boolean sendMail4TransmittedTxn(String partnerCode, String mailSubject, String mailBody)
	{
		props = new Properties();
		
		props.setProperty("", "");
		
		boolean send = false;
		String fromAddress = "";
		String toAddress = "";
		String ccAddress = "";
		String bccAddress = "";
		try
		{
			fromAddress = "no.reply@uaeexchange.com";
			toAddress = props.getProperty(partnerCode + ".mail.smtp.toAddress");
			ccAddress = props.getProperty(partnerCode + ".mail.smtp.ccAddress");
			bccAddress = props.getProperty(partnerCode + ".mail.smtp.bccAddress");

			if ((fromAddress == null) || (fromAddress.trim().equals(""))) {
				fromAddress = props.getProperty("mail.smtp.fromAddress");
			}

			if (mailSubject == null) mailSubject = "";

			if (mailBody == null) mailBody = "";
		}
		catch (Exception eprops)
		{
			eprops.printStackTrace();
		}
		Session session = null;
		try
		{
			session = Session.getInstance(props, null);
			session.setDebug(false);

			Message message = new MimeMessage(session);
			InternetAddress from = new InternetAddress(fromAddress);
			message.setFrom(from);

			if ((toAddress != null) && (!toAddress.trim().equals(""))) {
				InternetAddress[] toAddr = InternetAddress.parse(toAddress);
				message.setRecipients(Message.RecipientType.TO, toAddr);
			}
			if ((ccAddress != null) && (!ccAddress.trim().equals(""))) {
				InternetAddress[] ccAddr = InternetAddress.parse(ccAddress);
				message.setRecipients(Message.RecipientType.CC, ccAddr);
			}
			if ((bccAddress != null) && (!bccAddress.trim().equals(""))) {
				InternetAddress[] bccAddr = InternetAddress.parse(bccAddress);
				message.setRecipients(Message.RecipientType.BCC, bccAddr);
			}

			message.setSubject(mailSubject);

			MimeBodyPart mbp1 = new MimeBodyPart();
			mbp1.setContent("application/gif", "text/plain");
			
			mbp1.setText(mailBody);
		
			Multipart mp = new MimeMultipart();
			mp.addBodyPart(mbp1);

			message.setContent(mp);
			Transport.send(message);
			send = true;
		} catch (SendFailedException sfex) {  
			send = false;
			sfex.printStackTrace();
			sfex.printStackTrace(new PrintWriter(sw)); //V1.0 Begins
			exceptionAsString = sw.toString();
			System.out.println("SendFailedException  ******>>>>>>>>>"+exceptionAsString);
			if (sfex.getMessage().indexOf("550 No such user") >= 0)
			{
				send = true;
				System.out.println("****** Mail to the address " + toAddress + " is ignored ");
			}
			if (sfex.getMessage().indexOf("550 This user's mailbox is full") >= 0)
			{
				send = true;
				System.out.println("****** Mail to the address " + toAddress + " is ignored since the mailbox is full");
			}
		} catch (MessagingException mex) {
			send = false;
			System.out.println("****** Error " + mex.getMessage() + " --- To => " + toAddress);
			mex.printStackTrace(new PrintWriter(sw)); //V1.0 Begins
			exceptionAsString = sw.toString();
			System.out.println("MessagingException  ******>>>>>>>>>"+exceptionAsString);

			if ((mex.getMessage().indexOf("Illegal whitespace in address") >= 0) || (mex.getMessage().indexOf("Illegal character in domain") >= 0))
			{
				send = true;
				System.out.println("****** Mail to the address " + toAddress + " is skipped.");
			}
		} catch (Exception e) {
			send = false;
			e.printStackTrace(new PrintWriter(sw)); //V1.0 Begins
			exceptionAsString = sw.toString();
			System.out.println("Exception  ******>>>>>>>>>"+exceptionAsString);
			System.out.println("Error Sending Mail : " + e.getMessage());
		} finally {
			session = null;
		}
		return send;
	}

	// Loading and returning the "PayMyBillsProperties.props" file
	/*public Properties getProperty() {
		// get the path separator
		String sep = pathSeparator();

		String propsFileWithPath = System.getProperty("catalina.base") + sep
		+ "deploy" + sep + "XCQ.war" + sep + "WEB-INF" + sep
		+ "classes" + sep + "com" + sep + "xchg" + sep + "props" + sep
		+ "PayMyBillsProperties.props";
		props = new Properties();
		try {
			File filePath = new File(propsFileWithPath);
			props.load(new FileInputStream(filePath));
			filePath = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return props;
	}
	// Path separator
	public String pathSeparator() {

		String seperator = System.getProperties().getProperty("file.separator");
		if (seperator.equals("\\")) {
			seperator = "\\\\";
		}
		return seperator;
	}	*/

}
