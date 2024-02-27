import java.awt.*;
import java.awt.event.*;
class calculater extends Frame implements ActionListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Label l1,l2;
int c1=0;
int c2=0;

    calculater(){
        setLayout(null);
        b1=new Button();
        b1.setBounds(20,50,20,20);
        add(b1);
        b2=new Button();
        b2.setBounds(50,50,20,20);
        add(b2);
        b3=new Button();
        b3.setBounds(80,50,20,20);
        add(b3);
        b4=new Button();
        b4.setBounds(20,80,20,20);
        add(b4);
        b5=new Button();
        b5.setBounds(50,80,20,20);
        add(b5);
        b6=new Button();
        b6.setBounds(80,80,20,20);
        add(b6);
        b7=new Button();
        b7.setBounds(20,110,20,20);
        add(b7);
        b8=new Button();
        b8.setBounds(50,110,20,20);
        add(b8);
        b9=new Button();
        b9.setBounds(80,110,20,20);
        add(b9);
         l1=new Label("player 1");
          l1.setBounds(80,150,80,20);
          add(l1); 
          l2=new Label("player 2");
          l2.setBounds(80,180,80,20);
          add(l2);



        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);


    }
   public static void main(String[] args){
     calculater c=new calculater();
     c.setSize(300,300);
     c.setVisible(true);
}
int t=1;

void restart()
{
b1.setLabel("");
b2.setLabel("");
b3.setLabel("");
b4.setLabel("");
b5.setLabel("");
b6.setLabel("");
b7.setLabel("");
b8.setLabel("");
b9.setLabel("");
t=1;
}


     public void actionPerformed(ActionEvent e){
     
      if(e.getSource()==b1){
    if(b1.getLabel().length()==0)
    {   
       
        if(t%2==1){ 
          b1.setLabel("*");
               }
        else{
          b1.setLabel("0"); 
        }
      t=t+1;
      }
    
    }
        if(e.getSource()==b2){
          if(b2.getLabel().length()==0){
        if(t%2==1){
          b2.setLabel("*");

        }
        else{
          b2.setLabel("0");

        }
        t=t+1;
      }}
        if(e.getSource()==b3){
          if(b3.getLabel().length()==0){
        if(t%2==1){
          b3.setLabel("*");

        }
        else{
          b3.setLabel("0");

        }
        t=t+1;
      
      }}
        if(e.getSource()==b4){
          if(b4.getLabel().length()==0){
        if(t%2==1){
          b4.setLabel("*");

        }
        else{
          b4.setLabel("0");

        }
        t=t+1;
      
      }}
        if(e.getSource()==b5){
          if(b5.getLabel().length()==0){
          if(t%2==1){
          b5.setLabel("*");

          }
          else{
          b5.setLabel("0");

          }
          t=t+1;
        
        }}
          if(e.getSource()==b6){
            if(b6.getLabel().length()==0){
          if(t%2==1){
            b6.setLabel("*");
            }
            else{
              b6.setLabel("0");
            }
        t=t+1;
            }
          }
            if(e.getSource()==b7){
              if(b7.getLabel().length()==0){
              if(t%2==1){
                b7.setLabel("*");
              }
              else{
                b7.setLabel("0");
              }
        t=t+1;
            
            }}
              if(e.getSource()==b8){
                if(b8.getLabel().length()==0){
                if(t%2==1){
                  b8.setLabel("*");
                }
                else{
                  b8.setLabel("0");
                }
        t=t+1;
              
              }
              }
                if(e.getSource()==b9){
                  if(b9.getLabel().length()==0){
                if(t%2==1){
                  b9.setLabel("*");
                }
                else{
                  b9.setLabel("0");
                }
                    t=t+1;
                  }
              }
              String a=b1.getLabel();
              String b=b2.getLabel();
              String c=b3.getLabel();
              String d=b4.getLabel();
              String n=b5.getLabel();
              String f=b6.getLabel();
              String g=b7.getLabel();
              String h=b8.getLabel();
              String i=b9.getLabel();
if(a.length()!=0&&b.length()!=0&&c.length()!=0){
  if(a.equals(b)&&a.equals(c)){
    if(a.equals("*")){
System.out.println("winner is player 1");
c1++;

    }
    else {
System.out.println("winner is player 2");
c2++;

    }
restart();

  }
}
if(d.length()!=0&&n.length()!=0&&f.length()!=0){
  if(d.equals(n)&&d.equals(f)){
    if(d.equals("*")){
System.out.println("winner is player 1");
c1++;
    }
    else{
System.out.println("winner is player 2");
c2++;

    }
    restart();
  }
}
if(g.length()!=0&&h.length()!=0&&i.length()!=0){
  if(g.equals(h)&&g.equals(i)){
    if(g.equals("*")){
System.out.println("winner is player 1");
c1++;
    }
    else{
System.out.println("winner is player 2");
c2++;

    }
    restart();
  }
}
if(a.length()!=0&&d.length()!=0&&g.length()!=0){
  if(a.equals(d)&&a.equals(g)){
    if(a.equals("*")){
System.out.println("winner is player 1");
c1++;
    }
    else{
System.out.println("winner is player 2");
c2++;

    }
    restart();
  }
}
if(b.length()!=0&&n.length()!=0&&h.length()!=0){
  if(b.equals(n)&&b.equals(h)){
    if(b.equals("*")){
System.out.println("winner is player 1");
c1++;
    }
    else{
System.out.println("winner is player 2");
c2++;

    }
    restart();
  }
}     
if(c.length()!=0&&f.length()!=0&&i.length()!=0){
  if(c.equals(f)&&c.equals(i)){
    if(c.equals("*")){
System.out.println("winner is player 1");
c1++;
    }
    else{
System.out.println("winner is player 2");
c2++;

    }
    restart();
  }
}
if(a.length()!=0&&n.length()!=0&&i.length()!=0){
  if(a.equals(n)&&a.equals(i)){
    if(a.equals("*")){
System.out.println("winner is player 1");
c1++;
    }
    else{
System.out.println("winner is player 2");
c2++;
    }
    restart();
  }
}
if(c.length()!=0&&n.length()!=0&&g.length()!=0){
  if(c.equals(n)&&c.equals(g)){
    if(c.equals("*")){
System.out.println("winner is player 1");
c1++;
    }
    else{
System.out.println("winner is player 2");
c2++;
    }
    restart();
  }
}

if(t==10)
{
 System.out.println(" draw");
  restart();

}

l1.setText("Player1="+c1);
l2.setText("player 2="+c2); 
if(c1==3){
   System.out.println("win player1");
 }
 else if(c2==3){
 System.out.println("win player2");
     }

 }
 }
     
