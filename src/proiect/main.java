/**
 * 
 */
package proiect;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
/**
 * @author ioana
 *
 */
public class main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://127.0.0.1:3306/proiect","root","2002");
			System.out.println("ok!");
			con.close();
			}catch(Exception e){ System.out.println(e);}
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Login frame = new Login();
						frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		
	}

}
