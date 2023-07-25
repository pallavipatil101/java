package daily.task.practice;

import java.awt.Cursor;

import javax.swing.JFrame;

public class CurserTest extends JFrame {
	  public void CursorTest() {
	      setTitle("Cursor Test");
	      Cursor cursor = new Cursor(Cursor.HAND_CURSOR); // HAND CURSOR
	      setCursor(cursor);
	      setSize(375, 250);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	      setVisible(true);
	   }
	   public static void main(String[] args) {
	      new CurserTest();
	   }
	}
