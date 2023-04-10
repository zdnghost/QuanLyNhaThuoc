import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail {
	public static void main(String[] args) {
		new SendEmail("phathcm03@gmail.com","Day la thu test","Day la mail test");
	}
	
   public SendEmail(String to/* Địa chỉ email của người nhận*/,String subjectText,String Text)
   {
		     String from = "zdnghost23122003@gmail.com"; // Địa chỉ email của người gửi
		     String host = "smtp.gmail.com"; // Tên máy chủ SMTP của nhà cung cấp dịch vụ email
		     final String username = "zdnghost23122003"; // Tên đăng nhập vào tài khoản email của bạn
		     final String password = "balqaqcuelzkwgwa"; // Mật khẩu đăng nhập vào tài khoản email của bạn
	
		      // Cấu hình thông tin SMTP
		     Properties props = new Properties();
		     props.put("mail.smtp.auth", "true");
		     props.put("mail.smtp.starttls.enable", "true");
		     props.put("mail.smtp.host", host);
		     props.put("mail.smtp.port", "587");
	
		      // Tạo đối tượng Session để gửi email
		     Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		     protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(username, password);
		         }
		      });
	
		      try {
		         // Tạo đối tượng MimeMessage
		         MimeMessage message = new MimeMessage(session);
	
		         // Thiết lập thông tin người gửi, người nhận và tiêu đề email
		         message.setFrom(new InternetAddress(from));
		         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		         message.setSubject(subjectText);
	
		         // Thiết lập nội dung email
		         message.setText(Text);
	
		         // Gửi email
		         Transport.send(message);
		         System.out.println("Email sent successfully");
		      } catch (MessagingException e) {
		         throw new RuntimeException(e);
		      }
		   }
   
      
}
