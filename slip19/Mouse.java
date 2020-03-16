import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <APPLET CODE ="AppletKeyboard.class" WIDTH=300 HEIGHT=200> </APPLET> */
public class AppletKeyboard extends Applet implements KeyListener
  {
       TextField t,tt,tp,tr;
        public void init()
            {
                t=new TextField(20);
                t.addKeyListener(this);
                tt=new TextField(70);
                tp=new TextField(70);
                tr=new TextField(70);
                add(t);
                add(tt);
                add(tr);
                add(tp);
            }
                public void keyTyped(KeyEvent e)
                     {
                         tt.setText("key Released"+e.getKeyChar());
                      }
                          public void keyReleased(KeyEvent e)
                             {
                                 tr.setText("key Released"+e.getKeyChar());
                             }
                                 public void keyPressed(KeyEvent e)
                                    {
                                       int kc;
                                     String s;
                                     kc=e.getKeyCode();
                                     s=e.getKeyText(kc);
                                     tp.setText("Key Pressed"+s);
                                  }
   }     
